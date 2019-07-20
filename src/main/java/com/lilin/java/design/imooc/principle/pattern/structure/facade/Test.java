package com.lilin.java.design.imooc.principle.pattern.structure.facade;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/7/20下午8:35
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
