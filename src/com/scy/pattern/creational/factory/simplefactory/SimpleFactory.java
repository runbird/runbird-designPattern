package com.scy.pattern.creational.factory.simplefactory;

import com.scy.pattern.creational.factory.Pizza;
import com.scy.pattern.creational.factory.simplefactory.old.CheesePizza;
import com.scy.pattern.creational.factory.simplefactory.old.GreekPizza;

/**
 * 类名： SimpleFactory <br>
 * 描述：简单工厂类 <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("using simpleFactory method");

        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
         return pizza;
    }

    //简单工厂模式 也叫 静态工厂模式
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("using simpleFactory method2");

        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
