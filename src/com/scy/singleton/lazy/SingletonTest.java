package com.scy.singleton.lazy;

/**
 * 类名： SingletonTest <br>
 * 描述：单例-懒汉模式 <br>
 * 创建日期： 2020/4/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class SingletonTest {

    private SingletonTest() {}

    private static SingletonTest instance;

    //线程不安全
    public static SingletonTest getInstance() {
        return new SingletonTest();
    }

    //线程不安全
    public static SingletonTest getInstance2() {
        if (instance == null) {
            return new SingletonTest();
        }
        return instance;
    }

    //线程安全同步代码块
    public static synchronized SingletonTest getInstance3() {
        if (instance == null) {
            return new SingletonTest();
        }
        return instance;
    }

    //双检索 线程安全
    public static SingletonTest getInstance4() {
        if (instance == null) {
            synchronized (SingletonTest.class) {
                if (instance == null) {
                    return new SingletonTest();
                }
            }
        }
        return instance;
    }
}
