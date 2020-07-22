package com.scy.factory.abstractFactory;

import com.scy.factory.Pizza;
import com.scy.factory.factorymethod.SHCheesePizza;
import com.scy.factory.factorymethod.SHPepperPizza;

/**
 * 类名： SHFactory <br>
 * 描述：TODO <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class SHFactory implements Factory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new SHCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new SHPepperPizza();
        }
        return pizza;
    }
}
