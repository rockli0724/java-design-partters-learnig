package com.lilin.java.design.imooc.principle.pattern.structural.decorator.v2;

/**
 * @author lilin
 * @Title: EggDecorator
 * @date 2019/7/20下午11:09
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABattercake decorator) {
        super(decorator);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 1;
    }
}
