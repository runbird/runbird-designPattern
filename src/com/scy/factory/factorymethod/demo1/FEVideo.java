package com.scy.factory.factorymethod.demo1;

/**
 * 类名： FEVideo <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/13 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("FE");
    }
}
