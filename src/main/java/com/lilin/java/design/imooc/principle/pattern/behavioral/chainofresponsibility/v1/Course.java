package com.lilin.java.design.imooc.principle.pattern.behavioral.chainofresponsibility.v1;

/**
 * @author lilin
 * @Title: Course
 * @date 2020/5/2下午10:37
 */
public class Course {
    private String name;
    private String article;
    private String videao;

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public String getArticle() {
        return article;
    }

    public Course setArticle(String article) {
        this.article = article;
        return this;
    }

    public String getVideao() {
        return videao;
    }

    public Course setVideao(String videao) {
        this.videao = videao;
        return this;
    }
}
