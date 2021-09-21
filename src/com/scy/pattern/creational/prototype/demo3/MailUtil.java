package com.scy.pattern.creational.prototype.demo3;

import java.text.MessageFormat;

public class MailUtil {

    public static void sendMail(Mail mail) {
        String content = "向{0}先生/女士, 邮件地址:{1},发送内容:{2}";
        System.out.println(MessageFormat.format(content, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginRecord(Mail mail) {
        System.out.println("存储原始Mail记录：" + mail.getContent());
    }
}
