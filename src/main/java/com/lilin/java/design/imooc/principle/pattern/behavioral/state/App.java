package com.lilin.java.design.imooc.principle.pattern.behavioral.state;

/**
 * @author lilin
 * @Title: App
 * @date 2020/5/2下午6:48
 */
public class App {

    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoStatus(new PlayState());
        courseVideoContext.play();
        System.out.println("当前状态=" + courseVideoContext.getCourseVideoStatus().getClass().getSimpleName());
        courseVideoContext.spauls();
        System.out.println("当前状态=" + courseVideoContext.getCourseVideoStatus().getClass().getSimpleName());
        courseVideoContext.speed();
        System.out.println("当前状态=" + courseVideoContext.getCourseVideoStatus().getClass().getSimpleName());
        courseVideoContext.stop();
        System.out.println("当前状态=" + courseVideoContext.getCourseVideoStatus().getClass().getSimpleName());
        courseVideoContext.speed();
        System.out.println("当前状态=" + courseVideoContext.getCourseVideoStatus().getClass().getSimpleName());
    }
}
