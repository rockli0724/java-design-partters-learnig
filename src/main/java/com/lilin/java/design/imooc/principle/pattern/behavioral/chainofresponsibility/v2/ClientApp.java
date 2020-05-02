package com.lilin.java.design.imooc.principle.pattern.behavioral.chainofresponsibility.v2;

/**
 * @author lilin
 * @Title: ClientApp
 * @date 2019/7/20下午9:02
 */
public class ClientApp {
    public static void main(String[] args) {
        ProcessingObject<String> headerTextProcessing = new HeaderTextProcessing();
        ProcessingObject<String> headerTextProcessing2 = new SpellCheckProcessing();
        //开始设置处理路程
        headerTextProcessing.setSuccessor(headerTextProcessing2);
        String input = "这是我的责任链模式测试input";
        String handler = headerTextProcessing.handler(input);
        System.out.println(handler);

    }
}
