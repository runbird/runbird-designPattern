package com.scy.pattern.structural.bridge;

/**
 * 类名： Test <br>
 * 描述： <br>
 * 创建日期： 2021/9/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAcccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        ABCBank abcBank = new ABCBank(new SavingAcccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
