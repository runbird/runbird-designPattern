package com.scy.facade;

/**
 * 类名： Test <br>
 * 描述： 不需要关心子系统内部实现 <br>
 * 创建日期： 2021/9/19 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Test {
    public static void main(String[] args) {
        PointGift pointGift = new PointGift("IPhone13");
        QualifyService qualifyService = new QualifyService();
        PointsPaymentService pointsPaymentService = new PointsPaymentService();
        ShippingService shippingService = new ShippingService();
        GiftExchangeService giftExchangeService = new GiftExchangeService(qualifyService, pointsPaymentService, shippingService);
        giftExchangeService.giftExchange(pointGift);


        System.out.println("======使用门面模式-外观模式======");

        PointGift gift = new PointGift("MacPro");
        GiftExchangeServiceF giftExchangeServiceF = new GiftExchangeServiceF();
        giftExchangeServiceF.giftExchange(gift);
    }
}
