package com.lilin.java.design.imooc.principle.pattern.behavioral.templatemethod;

/**
 * @author lilin
 * @Title: ACourse
 * @date 2019/4/14下午10:47
 */
public abstract class ACourse {

    /**
     * 模板方法核心要素
     * 修饰符设置为final 为的是避免子类重写并修改实现细节
     */
    protected final void makeCourse() {
        //模板方法核心
        this.makePPT();
        this.makeVideo();
        //钩子方法
        if (needWriteArticle()) {
            this.writerArticle();
        }
        this.packageCourse();

    }

    final void makePPT() {
        System.out.println("制作PPT");
    }


    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writerArticle() {
        System.out.println("编写手记");
    }

    //钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
