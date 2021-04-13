package com.lilin.basic.spring.bean.circledependency;

import org.springframework.stereotype.Component;

@Component
public class B {

    private A a;

    public void setA(A a) {
        this.a = a;
    }
}
