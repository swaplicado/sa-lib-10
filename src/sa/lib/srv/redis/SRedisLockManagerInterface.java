/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.lib.srv.redis;

import sa.lib.gui.SGuiClient;

/**
 *
 * @author Adrián Avilés
 */
public interface SRedisLockManagerInterface {

    public abstract SRedisLock gainLock(SGuiClient client, int registryType, Object registryPk, long timeout) throws Exception;

    public abstract SRedisLock verifyLockStatus(SGuiClient client, SRedisLock rlock) throws Exception;

    public abstract void releaseLock(SGuiClient client, SRedisLock rlock) throws Exception;
}
