package com.xdclass.couponapp.service.impl;

import com.xdclass.couponapp.dao.CouponDAO;
import com.xdclass.couponapp.dto.CouponDTO;
import com.xdclass.couponapp.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired(required = false)
    private CouponDAO couponDAO;

    @Override
    public int insertCoupon(CouponDTO couponDTO) {
        return couponDAO.insertCoupon(couponDTO);
    }

    @Override
    public void updateCouponByCode(CouponDTO couponDTO) {
        couponDAO.updateCouponByCode(couponDTO);
    }

    @Override
    public CouponDTO getCouponByCode(String code) {
        return couponDAO.getCouponByCode(code);
    }

    @Override
    public void deleteCouponByCode(String code) {
        couponDAO.deleteCouponByCode(code);
    }

}
