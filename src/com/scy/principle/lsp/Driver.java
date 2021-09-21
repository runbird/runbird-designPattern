package com.scy.principle.lsp;

/**
 * 类名： Driver <br>
 * 描述：TODO <br>
 * 创建日期： 2021/3/15 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Driver implements IDriver {
    @Override
    public void driver(ICar car) {
        car.run();
    }
}
