package net.afghl.lock;

public interface Lock {
    LockHolder lock(String key, int timeout);

    void unlock(LockHolder lockHolder);
}
