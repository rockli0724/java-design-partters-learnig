package com.lilin.java.design.imooc.principle.pattern.behavioral.state;

/**
 * @author lilin
 * @Title: PlayState
 * @date 2020/5/2下午6:20
 */
public class PauseState extends CourseVideoStatus {


    @Override
    protected void play() {
        super.courseVideoContext.setCourseVideoStatus(CourseVideoContext.PLAY_STATE);
    }

    @Override
    protected void pause() {
        System.out.println("停止播放状态");
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
