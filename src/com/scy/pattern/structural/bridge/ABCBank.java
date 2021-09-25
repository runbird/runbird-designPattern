package com.scy.pattern.structural.bridge;

/**
 * 类名： ABCBank <br>
 * 描述： <br>
 * 创建日期： 2021/9/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开ABC银行账号");
        account.openAccount();
        return account;
    }
}
