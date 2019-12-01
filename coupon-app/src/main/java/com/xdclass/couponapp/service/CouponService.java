package com.xdclass.couponapp.service;

import com.xdclass.couponapp.dto.CouponDTO;

public interface CouponService {

    int insertCoupon(CouponDTO couponDTO);

    void updateCouponByCode(CouponDTO couponDTO);

    CouponDTO getCouponByCode(String code);

    void deleteCouponByCode(String code);

}
