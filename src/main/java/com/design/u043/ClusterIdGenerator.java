package com.design.u043;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 集群id生成器
 * 伪代码
 *
 * @author leojin
 * @date 2021/04/06
 */
public class ClusterIdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static ClusterIdGenerator instance;
//    private static SharedObjectStorage storage = FileSharedObjectStorage(/*入参省略，比如文件地址*/);
//    private static DistributedLock lock = new DistributedLock();

    private ClusterIdGenerator() {

    }

    public synchronized static ClusterIdGenerator getInstance() {
        if (instance == null) {
//        lock.lock();
//        instance = storage.load(ClusterIdGenerator.class);
        }
        return instance;
    }

    public synchronized void freeInstance() {
//        storage.save(this,IdGeneator.class);
        instance = null; //释放对象
//        lock.unlock();
    }

    public long getId() {
        return id.incrementAndGet();
    }


    public static void main(String[] args) {
        // IdGenerator使用举例
        ClusterIdGenerator idGeneator = ClusterIdGenerator.getInstance();
        long id = idGeneator.getId();
        idGeneator.freeInstance();
    }

}
