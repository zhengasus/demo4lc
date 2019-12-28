package com.example.serviceone.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author xu
 * @date 2019-12-28
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class IdName {
    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("name")
    private String name;
}
