package com.lilin.basic.lang.enums;

import java.util.concurrent.TimeUnit;

/**
 * @author lilin
 * @Title: EnumApp
 * @date 2019/9/22上午1:46
 */
public class EnumApp {


    public static void main(String[] args) throws Exception {

        Purpose purpose = Purpose.valueOf("REGISTER");
        TimeUnit.MINUTES.sleep(6);
        System.out.println(purpose);
    }
}
