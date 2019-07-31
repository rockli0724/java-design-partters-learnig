package com.lilin.java.design.imooc.principle.pattern.structural.composite;

/**
 * @author lilin
 * @Title: App
 * @date 2019/7/31下午10:27
 */
public class App {
    public static void main(String[] args) {
        CatalogComponent linux = new Course("Linux课程", 11);
        CatalogComponent windows = new Course("Windows课程", 123);

        CatalogComponent java = new CourseCatalog("java课程目录", 2);

        CatalogComponent java1 = new Course("java课程一期", 32);
        CatalogComponent java2 = new Course("java课程二期", 42);
        CatalogComponent java3 = new Course("java设计模式课程", 45);

        java.add(java1);
        java.add(java2);
        java.add(java3);

        CatalogComponent mainCategory = new CourseCatalog("课程们", 1);
        mainCategory.add(linux);
        mainCategory.add(windows);
        mainCategory.add(java);
        mainCategory.print();


    }
}
