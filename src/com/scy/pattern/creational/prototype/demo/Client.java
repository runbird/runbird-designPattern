package com.scy.pattern.creational.prototype.demo;

/**
 * 类名： Client <br>
 * 描述：TODO <br>
 * 创建日期： 2020/7/24 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("Tom", 1, "White");
        sheep.friend = new Sheep("Jack", 1, "Black");

        Sheep clone1 = (Sheep) sheep.clone();
        Sheep clone2 = (Sheep) sheep.clone();
        Sheep clone3 = (Sheep) sheep.clone();
        Sheep clone4 = (Sheep) sheep.clone();
        Sheep clone5 = (Sheep) sheep.clone();

        System.out.println("clone1=" + clone1 + "clone1.friend=" + clone1.friend.hashCode());
        System.out.println("clone2=" + clone2 + "clone2.friend=" + clone2.friend.hashCode());
        System.out.println("clone3=" + clone3 + "clone3.friend=" + clone3.friend.hashCode());
        System.out.println("clone4=" + clone4 + "clone4.friend=" + clone4.friend.hashCode());
        System.out.println("clone5=" + clone5 + "clone5.friend=" + clone5.friend.hashCode());
    }
}
