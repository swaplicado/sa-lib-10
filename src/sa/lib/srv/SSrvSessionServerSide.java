/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.lib.srv;

import java.rmi.RemoteException;

/**
 *
 * @author Sergio Flores
 */
public interface SSrvSessionServerSide {

    public SSrvResponse request(SSrvRequest request) throws RemoteException;
}
