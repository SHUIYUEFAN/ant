package com.lh.service;

import org.springframework.stereotype.Service;

/**
 * @Author: 水越帆
 * QQ:1548353431
 */
@Service
public class SmsServiceImpl implements ISmsService {
    @Override
    public ServiceResult<String> sendSms(String telephone) {
        return ServiceResult.of("123456");
    }

    @Override
    public String getSmsCode(String telephone) {
        return "123456";
    }

    @Override
    public void remove(String telephone) {

    }
}
