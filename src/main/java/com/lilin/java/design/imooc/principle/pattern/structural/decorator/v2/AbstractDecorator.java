package com.lilin.java.design.imooc.principle.pattern.structural.decorator.v2;

/**
 * @author lilin
 * @Title: AbstractDecorator
 * @date 2019/7/20下午11:04
 */
public abstract class AbstractDecorator extends ABattercake {

    private ABattercake decorator;

    //父类已经没有无参构造器，因此需要注入
    public AbstractDecorator(ABattercake decorator) {
        this.decorator = decorator;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.decorator.getDesc();
    }

    @Override
    protected int getCost() {
        return this.decorator.getCost();
    }
}
