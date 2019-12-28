package com.example.serviceone.config.dto;

import com.example.serviceone.common.IdName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author xu
 * @date 2019-12-28
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@ApiModel(value = "用户Dto")
public class UserDto extends IdName {
    @ApiModelProperty("性别")
    private String gender;

    @ApiModelProperty("年龄")
    private int age;
}
