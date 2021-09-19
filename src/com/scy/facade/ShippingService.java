package com.scy.facade;

/**
 * 类名： ShippingService <br>
 * 描述： <br>
 * 创建日期： 2021/9/19 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class ShippingService {
    /**
     * 物流订单号
     *
     * @param pointGift
     * @return
     */
    public String shipGift(PointGift pointGift) {
        System.out.println(pointGift.getName() + " 进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
