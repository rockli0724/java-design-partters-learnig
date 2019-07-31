package com.lilin.java.design.imooc.principle.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilin
 * @Title: EmployeeFactory
 * @date 2019/7/29下午11:08
 */
public class EmployeeFactory {

    private static final Map<String, Employee> STRING_EMPLOYEE_MAP = new HashMap<String, Employee>();

    public static Employee getManager(String department) {

        Manager manager = (Manager) STRING_EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理:" + department);
            String reportContent = department + "部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println("创建报道：" + reportContent);
            STRING_EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
