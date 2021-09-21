package com.scy.pattern.creational.prototype.clone;

import com.scy.pattern.creational.singleton.hunger.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("peppi", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        //需要对 关键内容也进行深拷贝，否则pig2内容也被更新
        pig1.getBirthday().setTime(6666666666666L);

        System.out.println(pig1);
        System.out.println(pig2);

        System.out.println("==================================");

        //需要重写clone方法
        HungrySingleton instance = HungrySingleton.getInstance();
        Method method = instance.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton invoke = (HungrySingleton) method.invoke(instance);
        System.out.println(instance);
        System.out.println(invoke);
    }
}
