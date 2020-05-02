package com.lilin.java.design.imooc.principle.pattern.behavioral.state;

/**
 * @author lilin
 * @Title: PlayState
 * @date 2020/5/2下午6:20
 */
public class StopState extends CourseVideoStatus {


    @Override
    protected void play() {
        super.courseVideoContext.setCourseVideoStatus(CourseVideoContext.PLAY_STATE);
    }

    @Override
    protected void pause() {
        System.err.println("ERROR 停止状态不能暂停！！！");

    }

    @Override
    protected void speed() {
        System.err.println("ERROR 停止状态不能快进！！！");
    }

    @Override
    protected void stop() {
        System.out.println("停止播放状态");
    }
}
