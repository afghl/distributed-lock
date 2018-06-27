package net.afghl.distributedlock.client;

import net.afghl.distributedlock.lock.DistributedLock;

public interface LockClient extends LockContext {

    DistributedLock getLock(String name);
}
