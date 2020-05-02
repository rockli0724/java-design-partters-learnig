package com.lilin.java.design.imooc.principle.pattern.behavioral.chainofresponsibility.v1;

/**
 * @author lilin
 * @Title: App
 * @date 2020/5/2下午10:47
 */
public class App {

    public static void main(String[] args) {
        Approver approver = new ArticleApprover();
        Approver approver2 = new VediaoApprover();

        Course course = new Course();
        course.setName("Java 设计模式精讲");
        course.setArticle("这是文章");
        course.setVideao("Java 设计模式视频");

        approver.setNextApprover(approver2);
        approver.deploy(course);

    }
}
