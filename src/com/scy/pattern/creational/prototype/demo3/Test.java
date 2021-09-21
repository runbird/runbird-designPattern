package com.scy.pattern.creational.prototype.demo3;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化内容");
        for (int i = 0; i < 10; i++) {
            Mail cloneMail = (Mail) mail.clone();
            cloneMail.setName("姓名" + i);
            cloneMail.setEmailAddress("地址" + i);
            cloneMail.setContent("更新内容");
            MailUtil.sendMail(cloneMail);
        }
        MailUtil.saveOriginRecord(mail);
    }
}
