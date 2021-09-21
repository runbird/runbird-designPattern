package com.scy.principle.lsp;

/**
 * 类名： Benz <br>
 * 描述：TODO <br>
 * 创建日期： 2021/3/15 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("Benz is running...");
    }
}
