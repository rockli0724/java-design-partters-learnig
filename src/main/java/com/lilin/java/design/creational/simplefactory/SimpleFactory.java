package com.lilin.java.design.creational.simplefactory;

/**
 * 简单工厂模式，简单来说就是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类（该模式并不属于GOF 23）
 *
 */
public class SimpleFactory {
	//汽车抽象
    static abstract class Car {
        abstract void run();
    }
    
  //奔驰汽车
    static class Benz extends Car{
		@Override
		void run() {
			   System.out.println("奔驰车在跑");
		}
    }
    
    //奔驰汽车
    static class BMW extends Car{
    	@Override
    	void run() {
    		System.out.println("奔驰汽车在跑");
    	}
    }
    
    //汽车工厂，根据汽车名称创建汽车
    static class CarFactory{
    	Car getCar(String name){
    		if(name.equals("Benz")){
    			return new Benz();
    		} else if (name.equals("BMW")){
    			return new BMW();
    		} else {
    			new IllegalArgumentException("No support this car");
    		}
			return null;
    	}
    }
    
    
    
}
