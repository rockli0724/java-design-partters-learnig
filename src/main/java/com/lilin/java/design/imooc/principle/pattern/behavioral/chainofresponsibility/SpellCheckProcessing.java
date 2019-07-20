package com.lilin.java.design.imooc.principle.pattern.behavioral.chainofresponsibility;

/**
 * @author lilin
 * @Title: SpellCheckProcessing
 * @date 2019/7/20下午9:01
 */
public class SpellCheckProcessing extends ProcessingObject<String> {

    @Override
    protected String handleWorker(String input) {
        return "from Rockli SpellCheckProcessing input " + input;
    }
}
