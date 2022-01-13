/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.lib.srv;

import sa.lib.gui.SGuiClient;

/**
 *
 * @author SW
 */
public interface SLockManagerInterface {
    public abstract SLock gainLock(SGuiClient client, int registryType, Object registryPk, long timeout) throws Exception;

    public abstract SLock verifyLockStatus(SGuiClient client, SLock slock) throws Exception;

    public abstract void releaseLock(SGuiClient client, SLock slock) throws Exception;
}
