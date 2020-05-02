package com.lilin.java.design.imooc.principle.pattern.behavioral.chainofresponsibility.v1;

import org.apache.commons.lang3.StringUtils;

/**
 * 视频
 * @author lilin
 * @Title: ArticleApprover
 * @date 2020/5/2下午10:41
 */
public class VediaoApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotBlank(course.getVideao())) {
            System.out.println(course.getName() + "含有视频，批准！！");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不包含视频，流程结束");
        }
    }
}
