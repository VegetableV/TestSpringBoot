package com.swagger.swagger.bean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@ApiModel
@Data@AllArgsConstructor@NoArgsConstructor
public class Guest {
    @ApiParam("姓名")
    private String name;
    @ApiParam("角色")
    private String role;
}
