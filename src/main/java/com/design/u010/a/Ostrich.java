package com.design.u010.a;

public class Ostrich extends AbstractBird {
    //鸵鸟
    //...省略其他属性和方法...
    @Override
    public void fly() throws UnSupportedMethodException {
        throw new UnSupportedMethodException("I can't fly.'");
    }
}
