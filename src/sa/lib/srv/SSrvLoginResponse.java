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
public class SSrvLoginResponse implements Serializable {

    protected int mnResponseType;

    public SSrvLoginResponse(int responseType) {
        mnResponseType = responseType;
    }

    public int getResponseType() {
        return mnResponseType;
    }
}
