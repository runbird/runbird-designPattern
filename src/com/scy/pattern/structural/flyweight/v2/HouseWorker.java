package com.scy.pattern.structural.flyweight.v2;

/**
 * 类名： HouseWorker <br>
 * 描述： <br>
 * 创建日期： 2021/9/28 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class HouseWorker implements Worker {
    @Override
    public void doWork() {
        System.out.println("House Worker cleanning...");
    }
}
