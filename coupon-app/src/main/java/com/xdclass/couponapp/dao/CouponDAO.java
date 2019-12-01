package com.xdclass.couponapp.dao;

import com.xdclass.couponapp.dto.CouponDTO;

public interface CouponDAO {

    int insertCoupon(CouponDTO couponDTO);

    void updateCouponByCode(CouponDTO couponDTO);

    CouponDTO getCouponByCode(String code);

    void deleteCouponByCode(String code);

}
