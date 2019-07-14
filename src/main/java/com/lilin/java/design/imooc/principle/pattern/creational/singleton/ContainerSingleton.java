package com.lilin.java.design.imooc.principle.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器单例
 *
 * @author lilin
 * @Title: ContainerSingleton
 * @date 2019/7/14下午11:18
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> singletonMap = new ConcurrentHashMap<>();

    public static void putInstance(String key, Object instance) {
        if (!StringUtils.isBlank(key) && instance != null) {
            singletonMap.put(key, instance);
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

}
