package com.design.u041;


import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉式的身份证生成器
 *
 * @author leojin
 * @date 2021/04/06
 */
public class LazyIdGenerator {


    private AtomicLong id = new AtomicLong(0);
    private static LazyIdGenerator instance;

    private LazyIdGenerator() {
    }

    //加锁
    public static synchronized LazyIdGenerator getInstance() {
        if (instance == null) {
            instance = new LazyIdGenerator();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
