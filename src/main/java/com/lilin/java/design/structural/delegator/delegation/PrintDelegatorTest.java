package com.lilin.java.design.structural.delegator.delegation;

import com.lilin.java.design.structural.delegator.delegation.printers.APrinter;
import com.lilin.java.design.structural.delegator.delegation.printers.BPrinter;
import com.lilin.java.design.structural.delegator.delegation.printers.CPrinter;

/**
 * @author lilin
 * @Title: PrintDelegatorTest
 * @date 2020/5/10下午9:45
 */
public class PrintDelegatorTest {

    private static final String MESSAGE_TO_PRINT = "hello world";

    public static void main(String[] args) {
        PrintDelegator printDelegator = new PrintDelegator(new APrinter());
        PrintDelegator printDelegatorB = new PrintDelegator(new BPrinter());
        PrintDelegator printDelegatorC = new PrintDelegator(new CPrinter());
        printDelegator.print(MESSAGE_TO_PRINT);
        printDelegatorB.print(MESSAGE_TO_PRINT);
        printDelegatorC.print(MESSAGE_TO_PRINT);
    }
}
