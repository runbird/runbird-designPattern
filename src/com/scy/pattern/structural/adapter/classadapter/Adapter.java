package com.scy.pattern.structural.adapter.classadapter;

/**
 * 类名： Adapter <br>
 * 描述： <br>
 * 创建日期： 2021/9/20 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        // 增加内容
        super.adapteeRequest();
    }
}
