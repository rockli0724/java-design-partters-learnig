package com.lilin.java.design.imooc.principle.pattern.structural.composite;

/**
 * @author lilin
 * @Title: Course
 * @date 2019/7/31下午10:18
 */
public class Course extends CatalogComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + name + " Price:" + price);
    }
}
