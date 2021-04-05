package com.design.u041;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式身份证生成器
 *
 * @author leojin
 * @date 2021/04/06
 */
public class HungryIdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static final HungryIdGenerator instance = new HungryIdGenerator();

    private HungryIdGenerator() {
    }

    public static HungryIdGenerator getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
