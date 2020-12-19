package com.yx.cdss.extract.provider.common;

import org.redisson.api.RLock;

import java.util.concurrent.TimeUnit;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/
public interface WDistributedLock {

    RLock lock(String lockKey);

    RLock lock(String lockKey, int timeout);

    RLock lock(String lockKey, TimeUnit unit, int timeout);

    boolean tryLock(String lockKey, TimeUnit unit, int waitTime, int leaseTime);

    void unlock(String lockKey);

    void unlock(RLock lock);
}
