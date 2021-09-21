package com.scy.pattern.creational.singleton.lazy;

/**
 * 类名： LazySingleton <br>
 * 描述：单例-懒汉模式 <br>
 * 创建日期： 2020/4/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class LazySingleton {

    private LazySingleton() {
    }

    private static LazySingleton instance;

    //线程不安全
    public static LazySingleton getInstance() {
        return new LazySingleton();
    }

    //线程不安全
    public static LazySingleton getInstance2() {
        if (instance == null) {
            return new LazySingleton();
        }
        return instance;
    }

    //线程安全同步代码块
    public static synchronized LazySingleton getInstance3() {
        if (instance == null) {
            return new LazySingleton();
        }
        return instance;
    }

    //双检索 线程安全
    public static LazySingleton getInstance4() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    return new LazySingleton();
                }
            }
        }
        return instance;
    }
}
