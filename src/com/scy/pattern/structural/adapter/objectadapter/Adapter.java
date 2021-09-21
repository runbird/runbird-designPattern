package com.scy.pattern.structural.adapter.objectadapter;

/**
 * 类名： Adapter <br>
 * 描述： <br>
 * 创建日期： 2021/9/20 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
