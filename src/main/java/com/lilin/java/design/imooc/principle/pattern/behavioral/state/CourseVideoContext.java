package com.lilin.java.design.imooc.principle.pattern.behavioral.state;

/**
 * @author lilin
 * @Title: CourseVideoStatus
 * @date 2020/5/2下午6:17
 */
public class CourseVideoContext {

    protected final static PlayState PLAY_STATE = new PlayState();
    protected final static SpeedState SPEED_STATE = new SpeedState();
    protected final static PauseState PAUSE_STATE = new PauseState();
    protected final static StopState STOP_STATE = new StopState();
    private CourseVideoStatus courseVideoStatus;

    public CourseVideoContext() {
    }

    public CourseVideoStatus getCourseVideoStatus() {
        return courseVideoStatus;
    }


    public void setCourseVideoStatus(CourseVideoStatus courseVideoStatus) {
        this.courseVideoStatus = courseVideoStatus;
        this.courseVideoStatus.setCourseVideoContext(this);
    }

    public void play() {
        this.courseVideoStatus.play();
    }

    public void speed() {
        this.courseVideoStatus.speed();
    }

    public void spauls() {
        this.courseVideoStatus.pause();
    }

    public void stop() {
        this.courseVideoStatus.stop();
    }
}
