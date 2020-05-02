package com.lilin.java.design.imooc.principle.pattern.behavioral.state;

/**
 * @author lilin
 * @Title: PlayState
 * @date 2020/5/2下午6:20
 */
public class SpeedState extends CourseVideoStatus {


    @Override
    protected void play() {
        super.courseVideoContext.setCourseVideoStatus(CourseVideoContext.PLAY_STATE);
    }

    @Override
    protected void pause() {
        super.courseVideoContext.setCourseVideoStatus(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    protected void speed() {
        System.out.println("快进播放状态");
    }

    @Override
    protected void stop() {
        super.courseVideoContext.setCourseVideoStatus(CourseVideoContext.STOP_STATE);
    }
}
