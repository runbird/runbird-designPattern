package com.scy.pattern.structural.flyweight;

/**
 * 类名： Manager <br>
 * 描述： <br>
 * 创建日期： 2021/9/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Manager implements Employee {
    private String department;
    private String reportContent;

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getDepartment() {
        return department;
    }
}
