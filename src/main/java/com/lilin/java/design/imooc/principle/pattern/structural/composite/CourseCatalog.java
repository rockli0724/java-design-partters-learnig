package com.lilin.java.design.imooc.principle.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilin
 * @Title: CourseCatalog
 * @date 2019/7/31下午10:21
 */
public class CourseCatalog extends CatalogComponent {

    private List<CatalogComponent> item = new ArrayList<>();

    private String name;

    private Integer level;


    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        item.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        item.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }


    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent component : item) {
            if (this.level != null) {
                for (Integer i = 0; i < this.level; i++) {
                    System.out.print(" ");
                }
            }
            component.print();
        }
    }
}
