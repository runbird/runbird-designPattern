package com.scy.basic.lsp.inject;

import com.scy.basic.lsp.ICar;

/**
 * 类名： ConstructCar <br>
 * 描述：TODO <br>
 * 创建日期： 2021/3/15 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class ConstructDriver implements IDriverConstruct {
    private ICar car;

    public ConstructDriver(ICar car) {
        this.car = car;
    }

    @Override
    public void dirver() {
        this.car.run();
    }
}
