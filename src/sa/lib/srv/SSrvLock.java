/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sa.lib.srv;

import java.io.Serializable;
import java.util.Date;
import sa.lib.SLibConsts;

/**
 *
 * @author Sergio Flores
 */
public class SSrvLock extends SLock implements Serializable {

    protected int mnSessionId;
    protected int mnCompanyId;
    protected int mnRegistryType;
    protected Object moPrimaryKey;
    protected long mlTimeout;
    protected Date mtTimestamp;
    protected long mlLockId;
    protected int mnLockStatus;
    protected String msLockUser;

    /**
     * Creates new SSrvLock.
     * @param companyId
     * @param registryType
     * @param pk
     * @param timeout
     */
    public SSrvLock(int companyId, int registryType, Object pk, long timeout) {
        this(0, companyId, registryType, pk, timeout, null);
    }

    /**
     * Creates new SSrvLock.
     * @param companyId
     * @param registryType
     * @param pk
     * @param timeout
     * @param timestamp
     */
    public SSrvLock(int companyId, int registryType, Object pk, long timeout, Date timestamp) {
        this(0, companyId, registryType, pk, timeout, timestamp);
    }

    /**
     * Creates new SSrvLock.
     * @param sessionId
     * @param companyId
     * @param registryType
     * @param pk
     * @param timeout
     * @param timestamp
     */
    public SSrvLock(int sessionId, int companyId, int registryType, Object pk, long timeout, Date timestamp) {
        mnSessionId = sessionId;
        mnCompanyId = companyId;
        mnRegistryType = registryType;
        moPrimaryKey = pk;
        mlTimeout = timeout;
        mtTimestamp = timestamp;
        mlLockId = 0;
        mnLockStatus = SLibConsts.UNDEFINED;
        msLockUser = "";
    }

    public void setTimeout(long l) { mlTimeout = l; }
    public void setTimestamp(Date t) { mtTimestamp = t; }
    public void setLockId(long l) { mlLockId = l; }
    public void setLockStatus(int n) { mnLockStatus = n; }
    public void setLockUser(String user) { msLockUser = user; }

    public int getSessionId() { return mnSessionId; }
    public int getCompanyId() { return mnCompanyId; }
    public int getRegistryType() { return mnRegistryType; }
    public Object getPrimaryKey() { return moPrimaryKey; }
    public long getTimeout() { return mlTimeout; }
    public Date getTimestamp() { return mtTimestamp; }
    public long getLockId() { return mlLockId; }
    public int getLockStatus() { return mnLockStatus; }
    public String getLockUser() { return msLockUser; }

    @Override
    public SSrvLock clone() {
        SSrvLock lock = new SSrvLock(mnSessionId, mnCompanyId, mnRegistryType, moPrimaryKey, mlTimeout, mtTimestamp);

        lock.setLockId(mlLockId);
        lock.setLockStatus(mnLockStatus);
        lock.setLockUser(msLockUser);

        return lock;
    }
}
