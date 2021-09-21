package com.scy.pattern.creational.prototype.abstractprototype;

public class B extends A {

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        B clone = (B) b.clone();
    }
}
