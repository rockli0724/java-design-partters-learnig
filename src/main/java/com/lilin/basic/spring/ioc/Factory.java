package com.lilin.basic.spring.ioc;

/**
 * 工厂类（模拟）
 */
public class Factory {

     static Fruit getInstance(String className) {
        try {
            Fruit fruit = (Fruit) Class.forName(className).newInstance();
            return fruit;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
