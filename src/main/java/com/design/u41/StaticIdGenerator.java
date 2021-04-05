package com.design.u41;

import java.util.concurrent.atomic.AtomicLong;


/**
 * 静态内部类身份证生成器
 * <p>
 * SingletonHolder 是一个静态内部类，当外部类 IdGenerator 被加载的时候，并不会创建 SingletonHolder 实例对象。只有当调用 getInstance() 方法时，SingletonHolder
 * 才会被加载，这个时候才会创建 instance。instance 的唯一性、创建过程的线程安全性，都由 JVM 来保证。所以，这种实现方法既保证了线程安全，又能做到延迟加载
 *
 * @author leojin
 * @date 2021/04/06
 */
public class StaticIdGenerator {

    private AtomicLong id = new AtomicLong(0);

    private StaticIdGenerator() {
    }

    private static class SingletonHolder {
        private static final StaticIdGenerator instance = new StaticIdGenerator();
    }

    public static StaticIdGenerator getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
