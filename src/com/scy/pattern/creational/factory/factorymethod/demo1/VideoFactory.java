package com.scy.pattern.creational.factory.factorymethod.demo1;

/**
 * 类名： VideoFactory <br>
 * 描述：
 *
 *  类似 Collection 类
 *  类似 URLStreamHandlerFactory 类<br>
 * 创建日期： 2021/9/13 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */

public abstract class VideoFactory {

    /** 类似
     Iterator<E> iterator();
     URLStreamHandler createURLStreamHandler()
     */
    public abstract Video getVideo();
}
