package com.scy.pattern.creational.singleton.staticclass;

/**
 * 类名： SingletonTest3 <br>
 * 描述：单例-静态内部类
 * JVM类加载顺序 ,Class  SingletonTest3 初始化的时候不会立即装载 static class SingletonInstance,
 * 只有使用到了getInstance() ，才会装载 SingletonInstance<br>
 * 创建日期： 2020/4/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class SingletonTest3 {
    private SingletonTest3() {
    }

    private static class SingletonInstance {
        private static final SingletonTest3 INSTANCE = new SingletonTest3();
    }

    public static SingletonTest3 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
