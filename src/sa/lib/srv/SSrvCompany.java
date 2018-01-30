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
public final class SSrvCompany implements Serializable {

    private int mnCompanyId;
    private String msCompany;

    public SSrvCompany(int companyId, String company) {
        mnCompanyId = companyId;
        msCompany = company;
    }

    public int getCompanyId() {
        return mnCompanyId;
    }

    public String getCompany() {
        return msCompany;
    }
}
