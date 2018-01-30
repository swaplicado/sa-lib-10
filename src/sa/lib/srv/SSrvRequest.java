/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.lib.srv;

import java.io.Serializable;

/**
 *
 * @author Sergio Flores
 */
public class SSrvRequest implements Serializable {

    protected int mnRequestType;
    protected Object moPacket;

    /**
     * @param requestType Constants defined in sa.lib.srv.SSrvConsts.
     */
    public SSrvRequest(int requestType) {
        this(requestType, null);
    }

    /**
     * @param requestType Constants defined in sa.lib.srv.SSrvConsts.
     * @param packet Request information packet.
     */
    public SSrvRequest(int requestType, Object packet) {
        mnRequestType = requestType;
        moPacket = packet;
    }

    public void setRequestType(int n) {
        mnRequestType = n;
    }

    public void setPacket(Object packet) {
        moPacket = packet;
    }

    public int getRequestType() {
        return mnRequestType;
    }

    public Object getPacket() {
        return moPacket;
    }
}
