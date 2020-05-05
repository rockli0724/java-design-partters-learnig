package com.lilin.basic.thread.imooc.lesson3;

/**
 * @author lilin
 * @Title: Punishment
 * @date 2020/5/3上午12:43
 */
public class Punishment {

    private int leftCopyCount;
    private String wordToCopy;

    public Punishment(int leftCopyCount, String wordToCopy) {
        this.leftCopyCount = leftCopyCount;
        this.wordToCopy = wordToCopy;
    }

    public int getLeftCopyCount() {
        return leftCopyCount;
    }

    public Punishment setLeftCopyCount(int leftCopyCount) {
        this.leftCopyCount = leftCopyCount;
        return this;
    }

    public String getWordToCopy() {
        return wordToCopy;
    }

    public Punishment setWordToCopy(String wordToCopy) {
        this.wordToCopy = wordToCopy;
        return this;
    }
}
