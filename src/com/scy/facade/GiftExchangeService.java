package com.scy.facade;

/**
 * 类名： GiftExchangeService <br>
 * 描述： <br>
 * 创建日期： 2021/9/19 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class GiftExchangeService {
    private final QualifyService qualifyService;
    private final PointsPaymentService pointsPaymentService;
    private final ShippingService shippingService;


    public GiftExchangeService(QualifyService qualifyService, PointsPaymentService pointsPaymentService,
                               ShippingService shippingService) {
        this.qualifyService = qualifyService;
        this.pointsPaymentService = pointsPaymentService;
        this.shippingService = shippingService;
    }

    public void giftExchange(PointGift pointGift) {
        //权限校验
        if (qualifyService.isAvailable(pointGift)) {
            //积分扣减
            if (pointsPaymentService.pay(pointGift)) {
                String shippingNo = shippingService.shipGift(pointGift);
                System.out.println("物流下单成功：" + shippingNo);
            }
        }
    }
}
