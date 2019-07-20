package com.lilin.java.design.imooc.principle.pattern.structural.decorator.v2;

/**
 * @author lilin
 * @Title: Battercake
 * @date 2019/7/20下午11:13
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int getCost() {
        return 8;
    }
}
