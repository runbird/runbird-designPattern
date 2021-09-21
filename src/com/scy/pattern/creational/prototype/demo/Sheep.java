package com.scy.pattern.creational.prototype.demo;

/**
 * 类名： Sheep <br>
 * 描述：TODO <br>
 * 创建日期： 2020/7/24 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Sheep implements Cloneable {

    private String name;
    private int age;
    private String color;

    /**
     * 对象，clone默认是浅拷贝
     */
    public Sheep friend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
