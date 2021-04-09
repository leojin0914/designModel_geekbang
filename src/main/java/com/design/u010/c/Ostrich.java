package com.design.u010.c;

/**
 * 鸵鸟
 *
 * @author leojin
 * @date 2021/04/09
 */
public class Ostrich implements Tweetable, EggLayable {

    private TweetAbility tweetAbility = new TweetAbility(); //组合
    private EggLayAbility eggLayAbility = new EggLayAbility(); //组合

    @Override
    public void layEgg() {
        eggLayAbility.layEgg();//委托
    }

    @Override
    public void tweet() {
        tweetAbility.tweet();//委托
    }
}
