package com.scy.pattern.structural.flyweight.v2;

/**
 * 类名： CodeWorker <br>
 * 描述： <br>
 * 创建日期： 2021/9/28 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class CodeWorker implements Worker {
    @Override
    public void doWork() {
        System.out.println("Code Worker Coding...");
    }
}
