package com.scy.pattern.creational.factory.abstractFactory;

/**
 * 类名： JavaVideo <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/13 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("Java录制视频");
    }
}
