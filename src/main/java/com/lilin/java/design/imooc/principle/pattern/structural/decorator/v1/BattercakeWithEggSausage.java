package com.lilin.java.design.imooc.principle.pattern.structural.decorator.v1;

/**
 * @author lilin
 * @Title: BattercakeWithEggSausage
 * @date 2019/7/20下午10:58
 */
public class BattercakeWithEggSausage extends Battercake {
    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根火腿";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
