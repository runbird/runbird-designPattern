package com.scy.decorator.v2;

/**
 * 类名： AbstractDecorator <br>
 * 描述： <br>
 * 创建日期： 2021/9/19 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public abstract class AbstractDecorator extends ABattercake {

    private ABattercake aBattercake;

    /**
     * 通过抽象动态的方式将 AbstractDecorator 和 Battercake 关联起来，主需要传入子类Battercake到构造方法
     */
    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    //  AbstractDecorator 可以为抽象类，便可以增加dosomething() 方法
    //  protected abstract void dosomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
