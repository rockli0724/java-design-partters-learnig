package com.lilin.java.design.imooc.principle.pattern.structural.flyweight;

/**
 * @author lilin
 * @Title: App
 * @date 2019/7/29下午11:15
 */
public class App {

    private static final String departments[] = {"RD", "QA", "PM", "BD"};


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();

        }
    }
}
