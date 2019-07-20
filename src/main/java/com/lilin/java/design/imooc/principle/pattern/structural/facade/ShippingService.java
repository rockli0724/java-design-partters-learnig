package com.lilin.java.design.imooc.principle.pattern.structural.facade;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 物流系统
 *
 * @author lilin
 * @Title: ShippingService
 * @date 2019/7/20下午7:31
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        System.out.println(String.format("%s进入物流系统", pointsGift.getName()));
        String orderNo = RandomStringUtils.randomNumeric(20);
        return orderNo;
    }
}
