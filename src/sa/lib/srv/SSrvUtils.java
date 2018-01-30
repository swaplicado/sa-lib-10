/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.lib.srv;

import java.rmi.RemoteException;
import java.util.Date;
import sa.lib.SLibConsts;
import sa.lib.gui.SGuiSession;

/**
 *
 * @author Sergio Flores
 */
public abstract class SSrvUtils {

    /** Checks if lock on data registry was gained or recovered.
     *
     * @param lockRequestedAction Constants defined in sa.lib.srv.SSrvConsts (gain or recover lock).
     * @param lock Lock on data registry.
     */
    private static void evaluateLockObtention(final int lockRequestedAction, final SSrvLock lock) throws Exception {
        int lockObtained = SLibConsts.UNDEFINED;
        int lockDenied = SLibConsts.UNDEFINED;
        String msg = "";

        switch (lockRequestedAction) {
            case SSrvConsts.REQ_LOCK_GAIN:
                lockObtained = SSrvConsts.LOCK_GAINED;
                lockDenied = SSrvConsts.LOCK_GAIN_DENIED;
                msg = SSrvConsts.MSG_ERR_LOCK_GAIN_DENIED;
                break;
            case SSrvConsts.REQ_LOCK_RECOVER:
                lockObtained = SSrvConsts.LOCK_RECOVERED;
                lockDenied = SSrvConsts.LOCK_RECOVER_DENIED;
                msg = SSrvConsts.MSG_ERR_LOCK_RECOVER_DENIED;
                break;
            default:
                throw new Exception(SLibConsts.ERR_MSG_OPTION_UNKNOWN);
        }

        if (lock.getLockStatus() != lockObtained) {
            if (lock.getLockStatus() == lockDenied) {
                throw new Exception(msg + lock.getLockUser());
            }
            else {
                throw new Exception(SSrvConsts.MSG_ERR_LOCK_ON_EVALUATE);
            }
        }
    }

    /** Obtains lock on data registry.
     *
     * @param session Client user session.
     * @param lockRequestedAction Constants defined in sa.lib.srv.SSrvConsts (gain lock or recover lock).
     * @param idCompany Company ID.
     * @param typeRegistry Constants defined in erp.data.SDataConstants.
     * @param keyRegistry Primary key of data registry.
     * @param timeout Timeout of exclusive access.
     * @param timeout Timestamp of former lock when attempt to recover it.
     */
    private static SSrvLock lockRegistry(final SGuiSession session, final int lockRequestedAction, final int idCompany, final int typeRegistry, final Object keyRegistry, final long timeout, final Date timestamp_n) throws RemoteException, Exception {
        SSrvLock lock = new SSrvLock(idCompany, typeRegistry, keyRegistry, timeout, timestamp_n);
        SSrvRequest request = new SSrvRequest(lockRequestedAction, lock);
        SSrvResponse response = session.getSessionServerSide().request(request);

        if (response.getResponseType() != SSrvConsts.RESP_TYPE_OK) {
            throw new Exception(response.getMessage());
        }
        else {
            evaluateLockObtention(lockRequestedAction, (SSrvLock) response.getPacket());
        }

        return (SSrvLock) response.getPacket();
    }

    /** Gains lock on data registry.
     *
     * @param session Client user session.
     * @param idCompany Company ID.
     * @param typeRegistry Constants defined in erp.data.SDataConstants.
     * @param keyRegistry Primary key of data registry.
     * @param timeout Timeout of exclusive access.
     */
    public static SSrvLock gainLock(final SGuiSession session, final int idCompany, final int typeRegistry, final Object keyRegistry, final long timeout) throws RemoteException, Exception {
        return lockRegistry(session, SSrvConsts.REQ_LOCK_GAIN, idCompany, typeRegistry, keyRegistry, timeout, null);
    }

    /** Recovers lock on data registry.
     *
     * @param session Client user session.
     * @param idCompany Company ID.
     * @param typeRegistry Constants defined in erp.data.SDataConstants.
     * @param keyRegistry Primary key of data registry.
     * @param timeout Timeout of exclusive access.
     */
    public static SSrvLock recoverLock(final SGuiSession session, final int idCompany, final int typeRegistry, final Object keyRegistry, final long timeout, final Date timestamp) throws RemoteException, Exception {
        return lockRegistry(session, SSrvConsts.REQ_LOCK_RECOVER, idCompany, typeRegistry, keyRegistry, timeout, timestamp);
    }

    /** Verifies status of lock on data registry (alive or expired).
     *
     * @param session Client user session.
     * @param lock Lock on data registry.
     */
    public static SSrvLock verifyLockStatus(final SGuiSession session, final SSrvLock lock) throws RemoteException, Exception {
        SSrvLock lockVerified = null;
        SSrvRequest request = new SSrvRequest(SSrvConsts.REQ_LOCK_STATUS, lock);
        SSrvResponse response = session.getSessionServerSide().request(request);

        if (response.getResponseType() != SSrvConsts.RESP_TYPE_OK) {
            SSrvUtils.releaseLock(session, lock);
            throw new Exception(response.getMessage());
        }
        else {
            switch ((Integer) response.getPacket()) {
                case SSrvConsts.LOCK_ST_ALIVE:
                    lockVerified = lock;
                    break;
                case SSrvConsts.LOCK_ST_EXPIRED:
                    lockVerified = recoverLock(session, lock.getCompanyId(), lock.getRegistryType(), lock.getPrimaryKey(), lock.getTimeout(), lock.getTimestamp());
                    break;
                default:
                    throw new Exception(SSrvConsts.MSG_ERR_LOCK_ON_VERIFY);
            }
        }

        return lockVerified;
    }

    /** Releases lock and dependent locks on data registry.
     *
     * @param session Client user session.
     * @param lock Data registry lock.
     */
    public static void releaseLock(final SGuiSession session, final SSrvLock lock) throws RemoteException, Exception {
        SSrvRequest request = new SSrvRequest(SSrvConsts.REQ_LOCK_RELEASE, lock);
        SSrvResponse response = session.getSessionServerSide().request(request);

        if (response.getResponseType() != SSrvConsts.RESP_TYPE_OK) {
            throw new Exception(response.getMessage());
        }
    }
}
