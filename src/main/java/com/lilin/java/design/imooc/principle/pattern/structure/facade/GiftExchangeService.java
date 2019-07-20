package com.lilin.java.design.imooc.principle.pattern.structure.facade;

/**
 * 外观核心类
 *
 * @author lilin
 * @Title: GiftExchangeService
 * @date 2019/7/20下午7:34
 */
public class GiftExchangeService {
    //初始化核心类
    private final PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private final QualifyService qualifyService = new QualifyService();
    private final ShippingService shippingService = new ShippingService();

    /**
     * 核心facade暴露接口
     */
    public void giftExchange(PointsGift pointsGift) {
        //资格校验
        if (!qualifyService.isAvalable(pointsGift)) {
            return;
        }
        //支付积分校验
        if (!pointsPaymentService.pay(pointsGift)) {
            return;
        }
        String shipGift = shippingService.shipGift(pointsGift);
        System.out.println(shipGift);
    }

}
