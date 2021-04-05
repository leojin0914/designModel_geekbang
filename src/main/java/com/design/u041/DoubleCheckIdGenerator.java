package com.design.u041;

import java.util.concurrent.atomic.AtomicLong;


/**
 * 双重检查身份证生成器
 *
 * @author leojin
 * @date 2021/04/06
 */
public class DoubleCheckIdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static DoubleCheckIdGenerator instance;

    private DoubleCheckIdGenerator() {
    }

    public static DoubleCheckIdGenerator getInstance() {
        if (instance == null) {
            // 此处为类级别的锁
            synchronized (DoubleCheckIdGenerator.class) {
                if (instance == null) {
                    instance = new DoubleCheckIdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
