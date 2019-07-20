package com.lilin.java.design.imooc.principle.pattern.structural.decorator.v1;

/**
 * @author lilin
 * @Title: App
 * @date 2019/7/20下午10:59
 */
public class App {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " 销售价格:" + battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + " 销售价格:" + battercakeWithEgg.cost());


        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + " 销售价格:" + battercakeWithEggSausage.cost());

    }
}
