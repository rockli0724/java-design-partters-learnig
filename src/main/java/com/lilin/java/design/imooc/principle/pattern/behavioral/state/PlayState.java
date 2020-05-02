package com.lilin.java.design.imooc.principle.pattern.behavioral.state;

/**
 * @author lilin
 * @Title: PlayState
 * @date 2020/5/2下午6:20
 */
public class PlayState extends CourseVideoStatus {


    @Override
    protected void play() {
        System.out.println("正常播放状态");
    }

    @Override
    protected void pause() {
        super.courseVideoContext.setCourseVideoStatus(CourseVideoContext.PAUSE_STATE);

    }

    @Override
    protected void speed() {
        super.courseVideoContext.setCourseVideoStatus(CourseVideoContext.SPEED_STATE);
    }

    @Override
    protected void stop() {
        super.courseVideoContext.setCourseVideoStatus(CourseVideoContext.STOP_STATE);
    }
}
