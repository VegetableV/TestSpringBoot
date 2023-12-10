package com.swagger.swagger.controller;

import com.swagger.swagger.bean.Guest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;
@Api(tags = "用户接口")
@RestController()
@RequestMapping("/guest")
public class GuestController {
    @ApiOperation("查找接口")
    @PostMapping("/list")
    public String selct(String re){
        return "list";
    }
    @ApiOperation("一个添加接口")
    @GetMapping("/add")
    public String add(Guest guest){
        return " add /guest/list";
    }
    @RequestMapping("/toAdd")
    @ApiIgnore
    public String toAdd(){
        return "add";
    }

}
