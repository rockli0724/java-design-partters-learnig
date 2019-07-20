package com.lilin.java.design.imooc.principle.pattern.creational.prototype;

/**
 * @author lilin
 * @Title: Mail
 * @date 2019/7/15上午12:17
 */
public class Mail implements Cloneable {

    private String name;
    private String address;
    private String context;

    public Mail() {
        System.out.println("context has construct");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", context='" + context + '\'' +
                ", toString='" + super.toString() + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail");
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
