package com.scy.pattern.creational.singleton.hunger;

import java.io.Serializable;

/**
 * 类名： HungrySingleton <br>
 * 描述：单例-饿汉模式 <br>
 * 创建日期： 2020/4/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class HungrySingleton implements Serializable, Cloneable {
    private HungrySingleton() {
    }

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }

    // 错误重写
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
