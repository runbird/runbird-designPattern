package com.scy.adapter.objectadapter;

/**
 * 类名： Test <br>
 * 描述： <br>
 * 创建日期： 2021/9/20 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target objectTarget = new Adapter();
        objectTarget.request();
    }
}
