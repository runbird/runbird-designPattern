package com.scy.pattern.creational.factory.factorymethod.demo1;

/**
 * 类名： FEVideoFactory <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/13 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */

public class FEVideoFactory extends VideoFactory {
    Video video;

    @Override
    public Video getVideo() {
        video = new FEVideo();
        return video;
    }
}
