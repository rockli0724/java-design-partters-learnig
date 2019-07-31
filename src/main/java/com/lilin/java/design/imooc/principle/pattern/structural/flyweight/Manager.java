package com.lilin.java.design.imooc.principle.pattern.structural.flyweight;

/**
 * @author lilin
 * @Title: Manager
 * @date 2019/7/29下午11:11
 */
public class Manager implements Employee {

    private String title = "部门经理";
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println();
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
