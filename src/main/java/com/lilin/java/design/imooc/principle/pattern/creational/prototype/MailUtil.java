package com.lilin.java.design.imooc.principle.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author lilin
 * @Title: MailUtil
 * @date 2019/7/15上午12:19
 */
public class MailUtil {

    public static void sendMail(Mail mail) {
        String contest = "向同学{0},邮件地址:{1},邮件内容:{2}发送邮件";
        System.out.println(MessageFormat.format(contest, mail.getName(), mail.getAddress(), mail.getContext()));

    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录,originMail:" + mail.getContext());
    }


}
