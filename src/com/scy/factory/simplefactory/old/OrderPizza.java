package com.scy.factory.simplefactory.old;

import com.scy.factory.Pizza;

/**
 * 类名： OrderPizza <br>
 * 描述：
 * 1)优点是比较好理解，简单易操作。
 * 2)缺点是违反了设计模式的 ocp 原则，即对扩展开放，对修改关闭。即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
 * 3)比如我们这时要新增加一个 Pizza 的种类(Pepper 披萨)，我们需要做如下修改. 如果我们增加一个 Pizza 类，只要是订购 Pizza 的代码都需要修改. <br>
 * 创建日期： 2020/7/22 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        //订购披萨的类型
        String orderType;

        do {
            orderType = getType();
            if ("greek".equals(orderType)){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ("cheese".equals(orderType)) {
                CheesePizza cheesePizza = new CheesePizza();
                cheesePizza.setName("奶酪披萨");
            } else {
                break;
            }
            //maybe NPE
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }


    private String getType(){
        return "greek";
    }
}
