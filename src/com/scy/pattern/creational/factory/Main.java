package com.scy.pattern.creational.factory;

import java.util.Calendar;

/**
 * 类名： Main <br>
 * 描述：
 * 1)JDK 中的 Calendar 类中，就使用了简单工厂模式 <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Main {
    public static void main(String[] args) {
        // getInstance 是 Calendar 静态方法
        Calendar cal = Calendar.getInstance();

        System.out.println("年:" + cal.get(Calendar.YEAR));
        System.out.println("月 :" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:" + cal.get(Calendar.MINUTE));
        System.out.println("秒:" + cal.get(Calendar.SECOND));
    }
}
