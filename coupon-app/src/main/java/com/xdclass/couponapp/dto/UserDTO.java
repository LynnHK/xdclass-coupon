package com.xdclass.couponapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private int id;

    private String account;

    private String address;

    private String password;

    private String phone;

    private int point;

    private String remark;

    private String telPhone;

    private String username;

    private String zipCode;

    private long balance;

}
