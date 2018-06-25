package net.afghl.distributedlock.lock;

import java.util.ArrayList;
import java.util.stream.Stream;

public interface Lock {
    LockHolder lock(String key, int timeout);

    void unlock(LockHolder lockHolder);
}
