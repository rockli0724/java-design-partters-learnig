package com.lilin.java.design.imooc.principle.pattern.behavioral.iterator;

/**
 * @author lilin
 * @Title: CourseIterator
 * @date 2019/8/4下午11:12
 */
public interface CourseIterator {

    Course nextCourse();

    boolean isLastCourse();
}
