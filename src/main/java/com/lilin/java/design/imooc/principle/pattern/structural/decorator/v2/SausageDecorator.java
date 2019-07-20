package com.lilin.java.design.imooc.principle.pattern.structural.decorator.v2;

/**
 * @author lilin
 * @Title: SausageDecorator
 * @date 2019/7/20下午11:11
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake decorator) {
        super(decorator);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根火腿";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }

    @Override
    protected void doSomething() {

    }
}
