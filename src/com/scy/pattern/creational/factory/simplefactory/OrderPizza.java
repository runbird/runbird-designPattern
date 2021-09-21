package com.scy.pattern.creational.factory.simplefactory;

import com.scy.pattern.creational.factory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 类名： OrderPizza <br>
 * 描述：TODO <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class OrderPizza {

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        //用户输入的
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            //输出 pizza
            if (pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try (BufferedReader strin = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("input pizza 种类:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}