package com.design.u041;

import java.util.concurrent.atomic.AtomicLong;


/**
 * 枚举id生成器
 *
 * Java 枚举类型本身的特性，保证了实例创建的线程安全性和实例的唯一性
 *
 * @author leojin
 * @date 2021/04/06
 */
public enum EnumIdGenerator {

    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
