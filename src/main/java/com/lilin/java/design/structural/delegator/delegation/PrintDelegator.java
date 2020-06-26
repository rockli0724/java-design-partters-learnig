package com.lilin.java.design.structural.delegator.delegation;

/**
 * 代理对象 对外暴露
 *
 * @author lilin
 * @Title: PrintDelegator
 * @date 2020/5/10下午9:36
 */
public class PrintDelegator implements Printer {
    /**
     * 真正的执行代理对象
     */
    private final Printer printer;

    public PrintDelegator(Printer printer) {
        this.printer = printer;
    }


    @Override
    public void print(String message) {
        printer.print(message);
    }
}
