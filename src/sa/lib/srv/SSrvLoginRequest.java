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
public class SSrvLoginRequest implements Serializable {

    protected String msUserName;
    protected String msUserPassword;
    protected int mnCompanyId;

    public SSrvLoginRequest(String name, String password, int companyId) {
        msUserName = name;
        msUserPassword = password;
        mnCompanyId = companyId;
    }

    public java.lang.String getUserName() {
        return msUserName;
    }

    public java.lang.String getUserPassword() {
        return msUserPassword;
    }

    public int getCompanyId() {
        return mnCompanyId;
    }
}
