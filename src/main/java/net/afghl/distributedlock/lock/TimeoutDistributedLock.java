package net.afghl.distributedlock.lock;

import java.util.concurrent.TimeUnit;

/**
 *
 */
public interface TimeoutDistributedLock extends DistributedLock {
    void lock(long leaseTime, TimeUnit unit);

    void lockInterruptibly(long leaseTime, TimeUnit unit) throws InterruptedException;

    boolean tryLock(long waitTime, long leaseTime, TimeUnit unit) throws InterruptedException;
}
