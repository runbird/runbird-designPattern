package com.scy.pattern.structural.flyweight.v1;

/**
 * 类名： Test <br>
 * 描述： 享元模式，例如Integer，解决了多次创建对象的消耗，运用于缓存<br>
 * 创建日期： 2021/9/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test {
    private static final String[] departments = {"QA", "BD", "RD", "PM"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            //避免了频繁的创建部门经理
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }

        Integer a = Integer.valueOf(100);
        Integer b = 100;
        System.out.println("a == b :" + (a == b));

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;
        System.out.println("a == b :" + (c == d));
    }
}
