package com.scy.pattern.structural.flyweight.v2;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名： WorkerFactory <br>
 * 描述： <br>
 * 创建日期： 2021/9/28 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class WorkerFactory {
    private static final Map<String, Worker> WORK_MAP = new HashMap<>();

    public static Worker getWorker(String type) {
        Worker worker = WORK_MAP.get(type);
        if (worker == null) {
            if ("code".equals(type)) {
                WORK_MAP.put(type, new CodeWorker());
            } else {
                WORK_MAP.put(type, new HouseWorker());
            }
        }
        return WORK_MAP.get(type);
    }
}
