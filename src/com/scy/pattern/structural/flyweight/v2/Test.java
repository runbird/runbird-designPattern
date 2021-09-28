package com.scy.pattern.structural.flyweight.v2;

/**
 * 类名： Test <br>
 * 描述： <br>
 * 创建日期： 2021/9/28 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test {
    public static final String[] dict = {"code", "house"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String type = dict[(int) (Math.random() * dict.length)];
            Worker worker = WorkerFactory.getWorker(type);
            if (worker instanceof CodeWorker) {
                worker = new CodeWorker();
            } else if (worker instanceof HouseWorker) {
                worker = new HouseWorker();
            }
            worker.doWork();
        }
    }
}
