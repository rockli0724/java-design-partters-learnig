package com.lilin.java.design.imooc.principle.pattern.structure.facade;

/**
 * @author lilin
 * @Title: PointsPaymentService
 * @date 2019/7/20下午7:25
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println(String.format("支付%s积分成功", pointsGift.getName()));
        return true;
    }
}
