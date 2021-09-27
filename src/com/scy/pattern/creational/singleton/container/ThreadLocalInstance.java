package com.scy.pattern.creational.singleton.container;

/**
 * 类名： ThreadLocalInstance <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/17 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class ThreadLocalInstance {

    private ThreadLocalInstance() {
    }

    ;

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance =
            ThreadLocal.withInitial(() -> new ThreadLocalInstance());

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }
}
