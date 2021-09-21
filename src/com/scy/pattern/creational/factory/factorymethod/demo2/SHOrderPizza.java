package com.scy.pattern.creational.factory.factorymethod.demo2;

import com.scy.pattern.creational.factory.Pizza;

/**
 * 类名： SHOrderPizza <br>
 * 描述：披萨订购点 <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class SHOrderPizza extends AbstractOrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new SHCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new SHPepperPizza();
        }
        return pizza;
    }
}
