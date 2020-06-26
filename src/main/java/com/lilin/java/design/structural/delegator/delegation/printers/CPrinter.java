package com.lilin.java.design.structural.delegator.delegation.printers;

import com.lilin.java.design.structural.delegator.delegation.Printer;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lilin
 * @Title: APrinter
 * @date 2020/5/10下午9:38
 */
@Slf4j
public class CPrinter implements Printer {
    @Override
    public void print(String message) {
        log.info("CPrinter, message={}", message);

    }
}
