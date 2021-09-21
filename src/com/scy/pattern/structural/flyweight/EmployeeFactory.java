package com.scy.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名： EmployeeFactory <br>
 * 描述： <br>
 * 创建日期： 2021/9/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String deparment) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(deparment);
        if (manager == null) {
            manager = new Manager(deparment);
            System.out.print("创建部门经理：" + deparment);
            String reportContent = deparment + "部门汇报：此次报告内容为.....";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告：" + reportContent);
            EMPLOYEE_MAP.put(deparment, manager);
        }
        return manager;
    }
}
