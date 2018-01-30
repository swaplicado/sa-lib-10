/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.lib.srv;

import java.io.Serializable;
import sa.lib.SLibConsts;

/**
 *
 * @author Sergio Flores
 */
public class SSrvResponse implements Serializable {

    protected int mnResponseType;
    protected Object moPacket;
    protected int mnResultType;
    protected String msMessage;

    /**
     * @param responseType Constants defined in sa.lib.srv.SSrvConsts.
     */
    public SSrvResponse(int responseType) {
        this(responseType, null);
    }

    /**
     * @param responseType Constants defined in sa.lib.srv.SSrvConsts.
     * @param packet Response information packet.
     */
    public SSrvResponse(int responseType, Object packet) {
        mnResponseType = responseType;
        moPacket = packet;
        mnResultType = SLibConsts.UNDEFINED;
        msMessage = "";
    }

    public void setResponseType(int n) {
        mnResponseType = n;
    }

    public void setPacket(Object packet) {
        moPacket = packet;
    }

    public void setResultType(int n) {
        mnResultType = n;
    }

    public void setMessage(String s) {
        msMessage = s;
    }

    public int getResponseType() {
        return mnResponseType;
    }

    public Object getPacket() {
        return moPacket;
    }

    public int getResultType() {
        return mnResultType;
    }

    public String getMessage() {
        return msMessage;
    }
}
