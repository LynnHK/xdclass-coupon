package com.xdclass.couponapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
public class CouponAppApplicationTests {

    @Autowired(required = false)
    public MockMvc mockMvc;

}
