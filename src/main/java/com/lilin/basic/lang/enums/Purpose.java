package com.lilin.basic.lang.enums;

/**
 * @author i@huangdenghe.com
 * @date 2018/03/26
 */
public enum Purpose {

    /**
     * 注册
     */
    REGISTER("注册"),
    /**
     * 重设密码
     */
    RESET_PASSWORD("重设密码");

    private String name;

    Purpose(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
