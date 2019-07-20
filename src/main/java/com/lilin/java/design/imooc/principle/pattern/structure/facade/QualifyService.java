package com.lilin.java.design.imooc.principle.pattern.structure.facade;

/**
 * @author lilin
 * @Title: QualifyService
 * @date 2019/7/20下午7:26
 */
public class QualifyService {

    public boolean isAvalable(PointsGift pointsGift) {
        System.out.println(String.format("校验%s积分资格通过，库存通过", pointsGift.getName()));
        return true;
    }
}
