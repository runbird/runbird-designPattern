package com.scy.pattern.creational.singleton.container;

/**
 * 类名： Test <br>
 * 描述：TODO <br>
 * 创建日期： 2021/9/17 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test implements Runnable {
    @Override
    public void run() {
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Test());
        Thread t2 = new Thread(new Test());
        Thread t3 = new Thread(new Test());
        t1.start();
        t2.start();
        t3.start();

        System.out.println("main thread: " + ThreadLocalInstance.getInstance());
        System.out.println("main thread: " + ThreadLocalInstance.getInstance());
        System.out.println("main thread: " + ThreadLocalInstance.getInstance());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
