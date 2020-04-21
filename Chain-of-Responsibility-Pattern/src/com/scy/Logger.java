package com.scy;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.function.Consumer;

/**
 * 类名： Logger <br>
 * 描述：TODO <br>
 * 创建日期： 2019/12/17 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
@FunctionalInterface
public interface Logger {

    /**
     * 枚举log level
     */
    public enum LogLevel {

        INFO, DEBUG, WARNING, ERROR, FUNCTIONAL_MESSAGE, FUNCTIONAL_ERROR;

        public static LogLevel[] all() {
            return values();
        }
    }

    /**
     * 函数式接口中的唯一抽象
     * @param msg
     * @param severity
     */
    abstract void message(String msg, LogLevel severity);

    default Logger appendNext(Logger nextLogger) {
        return (msg, severity) -> {
            //前序Logger处理完以后用当前的Logger处理
           message(msg, severity);
            nextLogger.message(msg, severity);
        };
    }

    static Logger logger(LogLevel[] levels, Consumer<String> writeMessage) {
        EnumSet<LogLevel> set = EnumSet.copyOf(Arrays.asList(levels));
        return (msg, severity) -> {
            //判断是否能处理该日志级别
            if (set.contains(severity)) {
                writeMessage.accept(msg);
            }
        };
    }

    static Logger consoleLogger(LogLevel... levels) {
        return logger(levels, msg -> System.err.println("terminal log: " + msg));
    }

    static Logger emailLogger(LogLevel... levels) {
        return logger(levels, msg -> System.err.println("email log: " + msg));
    }

    static Logger fileLogger(LogLevel... levels) {
        return logger(levels, msg -> System.err.println("write log: " + msg));
    }

    public static void main(String[] args) {
        /**
         * 构建一个固定顺序的链 【终端记录——邮件记录——文件记录】
         * consoleLogger：终端记录，可以打印所有等级的log信息
         * emailLogger：邮件记录，打印功能性问题 FUNCTIONAL_MESSAGE 和 FUNCTIONAL_ERROR 两个等级的信息
         * fileLogger：文件记录，打印 WARNING 和 ERROR 两个等级信息
         */

        Logger logger = consoleLogger(LogLevel.all())
                .appendNext(emailLogger(LogLevel.FUNCTIONAL_MESSAGE, LogLevel.FUNCTIONAL_ERROR))
                .appendNext(fileLogger(LogLevel.WARNING, LogLevel.ERROR));

        // consoleLogger 可以记录所有 level 的信息
        logger.message("进入到订单流程，接收到参数，参数内容为XXXX", LogLevel.DEBUG);
        logger.message("订单记录生成.", LogLevel.INFO);

        // consoleLogger 处理完，fileLogger 要继续处理
        logger.message("订单详细地址缺失", LogLevel.WARNING);
        logger.message("订单省市区信息缺失", LogLevel.ERROR);

        // consoleLogger 处理完，emailLogger 继续处理
        logger.message("订单短信通知服务失败", LogLevel.FUNCTIONAL_ERROR);
        logger.message("订单已派送.", LogLevel.FUNCTIONAL_MESSAGE);
    }
}
