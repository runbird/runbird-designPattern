package com.scy.singleton.hunger;

/**
 * 类名： SingletonTest2 <br>
 * 描述：单例-饿汉模式 <br>
 * 创建日期： 2020/4/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class SingletonTest2 {
    private SingletonTest2() {}

    private static SingletonTest2 instance = new SingletonTest2();

    public static SingletonTest2 getInstance() {
        return instance;
    }
}
