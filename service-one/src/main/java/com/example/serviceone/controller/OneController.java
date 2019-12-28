package com.example.serviceone.controller;

import com.example.serviceone.Constants;
import com.example.serviceone.config.dto.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author xu
 * @date 2019-12-28
 */
@RestController
@RequestMapping(Constants.WEB_APP_API_PREFIX + "/user")
@Api(tags = {"user. 用户管理"})
public class OneController {

    @GetMapping(value = "/{id}")
    @ApiOperation("根据id查用户")
    @ResponseStatus(code = HttpStatus.OK)
    @ApiImplicitParam(paramType = "path", dataType = "string", name = "id", value = "用户id", required = true)
    public UserDto getUser(@PathVariable String id) {
        UserDto userDto = UserDto.builder()
                .age(10)
                .gender("F")
                .build();
        userDto.setId(id).setName("无名");
        return userDto;
    }

}
