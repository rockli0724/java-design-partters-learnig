package com.lilin.basic.spring.ioc;

public class App {
    public static void main(String[] args) throws Exception {
        Fruit instance = Factory.getInstance("com.lilin.basic.spring.ioc.Apple");
        if (instance != null) {
            System.out.println(instance);
        }


    }
}
