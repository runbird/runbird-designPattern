package com.scy.factory.abstractFactory;

import com.scy.factory.Pizza;

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

    Factory factory;

    public OrderPizza(Factory factory) {
        setFactory(factory);
    }

    public void setFactory(Factory factory) {
        Pizza pizza = null;
        //用户输入的
        String orderType = "";
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
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