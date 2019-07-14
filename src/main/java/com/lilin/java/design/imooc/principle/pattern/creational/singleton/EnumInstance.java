package com.lilin.java.design.imooc.principle.pattern.creational.singleton;

/**
 * @author lilin
 * @Title: EnumInstance
 * @date 2019/7/11下午11:57
 */
public enum EnumInstance {

    INSTANCE {
        protected void testPrint() {
            System.out.println("this is enum test");
        }
    };

    private Object data;

    /**
     * 单例模式的枚举方式
     *
     * @return
     */
    public static EnumInstance getInstance() {
        return INSTANCE;
    }

    protected abstract void testPrint();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
