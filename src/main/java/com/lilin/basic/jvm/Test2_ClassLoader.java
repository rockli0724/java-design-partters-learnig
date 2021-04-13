package com.lilin.basic.jvm;

import org.apache.commons.configuration.event.EventSource;

public class Test2_ClassLoader {

    public static void main(String[] args) {
        ClassLoader classLoader = Test2_ClassLoader.class.getClassLoader();
        ClassLoader loader = EventSource.class.getClassLoader();
        ClassLoader loaderParent = classLoader.getParent();
        ClassLoader loaderParentParent = loaderParent.getParent();
        System.out.println(classLoader);
        System.out.println(loader);
        System.out.println(loaderParent);
        System.out.println(loaderParentParent);
    }
}
