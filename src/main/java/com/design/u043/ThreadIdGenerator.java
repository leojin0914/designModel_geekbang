package com.design.u043;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;


/**
 * 线程唯一id生成器
 *
 * @author leojin
 * @date 2021/04/06
 */
public class ThreadIdGenerator {
    private AtomicLong id = new AtomicLong(0);

    private static final ConcurrentHashMap<Long, ThreadIdGenerator> instances
            = new ConcurrentHashMap<>();

    private ThreadIdGenerator() {}

    public static ThreadIdGenerator getInstance() {
        Long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new ThreadIdGenerator());
        return instances.get(currentThreadId);
    }

    public long getId() {
        return id.incrementAndGet();
    }
}



