package sa.lib.srv.redis;

import java.io.Serializable;
import java.util.Date;

public class SRedisLock implements Serializable {

    private Object moRegistryPk;
    private long mlTimeout;
    protected SRedisLockKey moLockKey;
    private Date mtLockTimestamp;
    
    public SRedisLock(final Object registryPk, final long timeout, final SRedisLockKey lockKey, final Date date) {
        moRegistryPk = registryPk;
        mlTimeout = timeout;
        moLockKey = lockKey;
        updateLockTimestamp(date);
    }

    public final void updateLockTimestamp(Date date) {
        mtLockTimestamp = date;
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
