package com.lilin.java.design.imooc.principle.pattern.creational.prototype;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/7/15上午12:23
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Mail mail = new Mail();
        mail.setContext("初始化模板");
        int count = 10;
        for (int i = 0; i < count; i++) {
            Mail mailTem = (Mail) mail.clone();
            mailTem.setAddress(i + "@qq.com");
            mailTem.setContext("邮件内容" + i);
            mailTem.setName("姓名" + i);
            MailUtil.sendMail(mailTem);
        }
        MailUtil.saveOriginMailRecord(mail);

    }
}
