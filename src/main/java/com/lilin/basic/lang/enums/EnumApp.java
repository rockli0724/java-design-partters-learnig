package com.lilin.basic.lang.enums;

/**
 * @author lilin
 * @Title: EnumApp
 * @date 2019/9/22上午1:46
 */
public class EnumApp {


    public static void main(String[] args) {

        Purpose purpose = Purpose.valueOf("REGISTER");
        System.out.println(purpose);
    }
}
