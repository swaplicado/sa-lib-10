package sa.lib.srv.redis;

import java.io.Serializable;
import java.util.Date;

public class SRedisLock implements Serializable {

    private Object moRegistryPk;
    private long mlTimeout;
    protected SRedisLockKey moLockKey;
    private Date mtLockTimestamp;
    
    public SRedisLock(final Object registryPk, final long timeout, final SRedisLockKey lockKey) {
        moRegistryPk = registryPk;
        mlTimeout = timeout;
        moLockKey = lockKey;
        updateLockTimestamp();
    }

    public final void updateLockTimestamp() {
        mtLockTimestamp = new Date();
    }
    
    public Object getRegistryPk() {
        return moRegistryPk;
    }
    
    public long getTimeout() {
        return mlTimeout;
    }
    
    public SRedisLockKey getLockKey() {
        return moLockKey;
    }

    public Date getLockTimestamp() {
        return mtLockTimestamp;
    }
}
