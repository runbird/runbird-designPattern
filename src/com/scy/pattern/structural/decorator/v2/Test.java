package com.scy.pattern.structural.decorator.v2;

/**
 * 类名： Test <br>
 * 描述： <br>
 * 创建日期： 2021/9/19 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test {
    public static void main(String[] args) {
        //该模式能够解决V1加两根香肠或者鸡蛋的情况，动态的方式
        ABattercake aBattercake;

        aBattercake = new Battercake();
        System.out.println(aBattercake.getDesc() + " 销售价格：" + aBattercake.cost());

        aBattercake = new EggDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + " 销售价格：" + aBattercake.cost());

        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + " 销售价格：" + aBattercake.cost());
    }
}
