package com.xdclass.couponapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CouponDTO {

    private int id;

    /**
     * 优惠券码
     */
    private String code;

    /**
     * 优惠券图
     */
    private String picUrl;

    /**
     * 达到满减资格金额
     */
    private int achieveAmount;

    /**
     * 所减金额
     */
    private int reduceAmount;

    /**
     * 库存，当库存为0时不可领取
     */
    private int stock;

    /**
     * 优惠券名称
     */
    private String title;

    /**
     * 可用状态，0表示可用，1表示不可用
     */
    private int status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date updateTime;

}
