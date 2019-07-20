package com.lilin.java.design.imooc.principle.pattern.behavioral.chainofresponsibility;

/**
 * @author lilin
 * @Title: ProcessingObject
 * @date 2019/7/20下午8:53
 */
public abstract class ProcessingObject<T> {

    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject<T> successor) {
        this.successor = successor;
    }

    /**
     * 责任链关键
     *
     * @param input
     * @return
     */
    public T handler(T input) {
        //下一个处理流程
        T r = handleWorker(input);
        if (successor != null) {
            return successor.handler(r);
        }
        return r;
    }


    abstract protected T handleWorker(T input);
}
