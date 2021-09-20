package com.scy.adapter.sample;

/**
 * 类名： PowerAdapter <br>
 * 描述： <br>
 * 创建日期： 2021/9/20 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outPutAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入交流电： " + adapterInput + "V 输出直流电： " + adapterOutput + "V");
        return adapterOutput;
    }
}
