package com.lilin.java.design.imooc.principle.pattern.behavioral.iterator;

import java.util.List;

/**
 * @author lilin
 * @Title: CourseIteratorImpl
 * @date 2019/8/4下午11:14
 */
public class CourseIteratorImpl implements CourseIterator {


    private List courseList;
    private int position;
    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程,位置是: " + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if (courseList.size() > position) {
            return false;
        }
        return true;
    }
}
