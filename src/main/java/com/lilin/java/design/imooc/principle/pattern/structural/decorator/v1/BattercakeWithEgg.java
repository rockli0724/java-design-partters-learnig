package com.lilin.java.design.imooc.principle.pattern.structural.decorator.v1;

/**
 * @author lilin
 * @Title: BattercakeWithEgg
 * @date 2019/7/20下午10:56
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
