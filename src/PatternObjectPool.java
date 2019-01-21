import java.util.LinkedList;
import java.util.List;

public class PatternObjectPool {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();
        PoolObject poolObject = objectPool.getPoolObject();
        objectPool.releasePoolObject(poolObject);
    }
}

class PoolObject {
}

class ObjectPool {
    List<PoolObject> free = new LinkedList<>();
    List<PoolObject> used = new LinkedList<>();

    public PoolObject getPoolObject() {
        if (free.isEmpty()) {
            PoolObject poolObject = new PoolObject();
            used.add(poolObject);
            return poolObject;
        } else {
            PoolObject poolObject = free.get(0);
            used.add(poolObject);
            return poolObject;
        }
    }

    public void releasePoolObject(PoolObject poolObject) {
        used.remove(poolObject);
        free.add(poolObject);
    }
}

