/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.lib.srv;

import java.io.Serializable;
import sa.lib.srv.redis.SRedisLock;

/**
 *
 * @author SW
 */
public class SLock implements Serializable{
    
    SSrvLock sLock;
    SRedisLock rLock;

    public SLock() {
        this.sLock = null;
        this.rLock = null;
    }
    
    public SLock(SSrvLock sLock) {
        this.sLock = sLock;
    }
    
    public SLock(SRedisLock rLock) {
        this.rLock = rLock;
    }

    public SSrvLock getServerLock() {
        return sLock;
    }

    public SRedisLock getRedisLock() {
        return rLock;
    }
    
    
    
}
