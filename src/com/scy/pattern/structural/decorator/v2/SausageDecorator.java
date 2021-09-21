package com.scy.pattern.structural.decorator.v2;

/**
 * 类名： SausageDecorator <br>
 * 描述： <br>
 * 创建日期： 2021/9/19 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class SausageDecorator extends AbstractDecorator {
    /**
     * 通过抽象动态的方式将 AbstractDecorator 和 Battercake 关联起来，主需要传入子类Battercake到构造方法
     *
     * @param aBattercake
     */
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
