package com.scy.pattern.creational.factory.factorymethod.demo1;

/**
 * 类名： Test <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/13 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        Video python = pythonVideoFactory.getVideo();
        python.produce();
    }
}
