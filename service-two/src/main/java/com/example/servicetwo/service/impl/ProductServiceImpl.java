package com.example.servicetwo.service.impl;

import com.example.service_one.client.api.User_Api;
import com.example.service_one.client.model.Dto;
import com.example.servicetwo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xu
 * @date 2019-12-28
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Autowired
    User_Api userApi;

    @Override
    public String getName() {
        Dto dto = userApi.getUserUsingGET("userIdFromProduct");
        log.info(dto.toString());
        return dto.getName();
    }
}
