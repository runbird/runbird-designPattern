package com.scy.pattern.structural.bridge;

/**
 * 类名： Bank <br>
 * 描述： <br>
 * 创建日期： 2021/9/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public abstract class Bank {
    /**
     * 通过组合的方式 使用了account
     */
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    /**
     * 方法名称可以和接口不一样
     * 使用同名的意义是通过接口委托实现
     */
    abstract Account openAccount();

}
