package com.lilin.java.design.imooc.principle.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilin
 * @Title: CourseAggregateImpl
 * @date 2019/8/4下午11:12
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;


    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
