package com.lilin.java.design.imooc.principle.pattern.behavioral.iterator;

/**
 * @author lilin
 * @Title: CourseAggregate
 * @date 2019/8/4下午11:11
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);


    CourseIterator getCourseIterator();
}
