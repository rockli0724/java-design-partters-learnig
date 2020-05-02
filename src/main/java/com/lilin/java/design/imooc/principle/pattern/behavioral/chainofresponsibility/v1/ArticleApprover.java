package com.lilin.java.design.imooc.principle.pattern.behavioral.chainofresponsibility.v1;

import org.apache.commons.lang3.StringUtils;

/**
 * @author lilin
 * @Title: ArticleApprover
 * @date 2020/5/2下午10:41
 */
public class ArticleApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotBlank(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准！！");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不包含手记，流程结束");
        }
    }
}
