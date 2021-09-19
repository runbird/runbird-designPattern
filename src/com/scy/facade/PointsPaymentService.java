package com.scy.facade;

/**
 * 类名： PointsPaymentService <br>
 * 描述： <br>
 * 创建日期： 2021/9/19 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class PointsPaymentService {
    /**
     * 扣减积分
     *
     * @param pointGift
     * @return
     */
    public boolean pay(PointGift pointGift) {
        System.out.println("扣减 " + pointGift.getName() + " 积分成功");
        return true;
    }
}
