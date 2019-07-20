package com.lilin.java.design.imooc.principle.pattern.behavioral.chainofresponsibility;

/**
 * @author lilin
 * @Title: HeaderTextProcessing
 * @date 2019/7/20下午9:00
 */
public class HeaderTextProcessing extends ProcessingObject<String> {

    @Override
    protected String handleWorker(String input) {
        return "from RockLi HeaderTextProcessing input=" + input;
    }
}
