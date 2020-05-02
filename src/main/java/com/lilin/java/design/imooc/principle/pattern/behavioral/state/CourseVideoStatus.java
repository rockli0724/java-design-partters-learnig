package com.lilin.java.design.imooc.principle.pattern.behavioral.state;

/**
 * @author lilin
 * @Title: CourseVideoStatus
 * @date 2020/5/2下午6:17
 */
public abstract class CourseVideoStatus {

    protected CourseVideoContext courseVideoContext;

    public CourseVideoStatus(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public CourseVideoStatus setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
        return this;
    }

    public CourseVideoStatus() {
    }

    /**
     * 播放
     */
    protected abstract void play();

    /**
     * 暂停
     */
    protected abstract void pause();

    /**
     * 快进
     */
    protected abstract void speed();

    /**
     * 停止
     */
    protected abstract void stop();

}
