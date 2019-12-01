package com.xdclass.couponapp.coupon;

import com.xdclass.couponapp.CouponAppApplicationTests;
import com.xdclass.couponapp.dto.CouponDTO;
import com.xdclass.couponapp.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CrudTest extends CouponAppApplicationTests {

    @Autowired
    private CouponService couponService;

    @Test
    public void insert() {
        CouponDTO dto = CouponDTO.builder().code("test011").picUrl("011.jpg").title("test011").achieveAmount(500).reduceAmount(20).stock(100).build();
        couponService.insertCoupon(dto);
        System.out.println(dto.getId());
    }

    @Test
    public void select() {
        CouponDTO dto = couponService.getCouponByCode("test001");
        System.out.println(dto);
    }

    @Test
    public void update() {
        CouponDTO dto = couponService.getCouponByCode("test001");
        dto.setAchieveAmount(1000);
        dto.setReduceAmount(100);
        couponService.updateCouponByCode(dto);
    }

    @Test
    public void delete() {
        couponService.deleteCouponByCode("test002");
    }

}
