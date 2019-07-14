/**
 * 单例模式
 * 优点：
 * 1.内存里只有一个实例，减少了内存开销
 * 2.避免对资源的多重复用
 * 3.设置全局访问点，严格控制访问
 * <p>
 * 缺点：
 * 1.没有接口，拓展困难
 * <p>
 * 重点：
 * 1.私有构造器
 * 2.线程安全
 * 3.延迟加载
 * 4.序列化和反序列化安全
 * 5.反射攻击
 *
 * @Title: package-info
 * @author lilin
 * @date 2019/7/8下午11:47
 */
package com.lilin.java.design.imooc.principle.pattern.creational.singleton;