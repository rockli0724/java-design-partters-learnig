package com.lilin.java.design.imooc.principle.pattern.structural.decorator.v2;

/**
 * @author lilin
 * @Title: App
 * @date 2019/7/20下午11:12
 */
public class App {
    public static void main(String[] args) {
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + " 销售价格:" + aBattercake.getCost());
    }
}
