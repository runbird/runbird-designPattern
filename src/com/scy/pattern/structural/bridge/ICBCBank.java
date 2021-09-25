package com.scy.pattern.structural.bridge;

/**
 * 类名： ICBCBank <br>
 * 描述： <br>
 * 创建日期： 2021/9/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开ICBC银行账号");
        account.openAccount();
        return account;
    }
}
