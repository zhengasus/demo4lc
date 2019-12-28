package com.example.servicetwo.controller;

import com.example.servicetwo.Constants;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xu
 * @date 2019-12-28
 */
@RestController()
@RequestMapping(Constants.WEB_APP_API_PREFIX + "/product")
@Api(tags = {"product. 商品管理"})
public class TwoController {

}
