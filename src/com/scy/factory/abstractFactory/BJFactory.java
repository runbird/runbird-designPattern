package com.scy.factory.abstractFactory;

import com.scy.factory.Pizza;
import com.scy.factory.factorymethod.BJCheesePizza;
import com.scy.factory.factorymethod.BJPepperPizza;

/**
 * 类名： BJFactory <br>
 * 描述：TODO <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class BJFactory implements Factory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}

