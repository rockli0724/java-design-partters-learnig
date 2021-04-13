package com.lilin.basic.spring.bean.circledependency;

import org.springframework.stereotype.Component;

@Component
public class A {

    private B b;

    public void setB(B b) {
        this.b = b;
    }
}
