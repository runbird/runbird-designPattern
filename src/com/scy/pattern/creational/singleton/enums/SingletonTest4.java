package com.scy.pattern.creational.singleton.enums;

/**
 * 类名： SingletonTest4 <br>
 * 描述：TODO <br>
 * 创建日期： 2020/4/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class SingletonTest4 {

    public static void main(String[] args) {
        SingleTon instance = SingleTon.INSTANCE;
        SingleTon instance2 = SingleTon.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }
}
//线程安全，并且可以防止反序列化
enum SingleTon {
    INSTANCE;
    public void sayOk() {
        System.out.println("it's done");
    }
}
