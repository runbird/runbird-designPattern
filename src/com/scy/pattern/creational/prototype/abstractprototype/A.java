package com.scy.pattern.creational.prototype.abstractprototype;

public abstract class A implements Cloneable {

    public A() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
