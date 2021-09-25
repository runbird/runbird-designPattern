package com.scy.pattern.structural.bridge;

/**
 * 类名： Account <br>
 * 描述： 银行账户<br>
 * 创建日期： 2021/9/25 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public interface Account {
    Account openAccount();

    void showAccountType();
}
