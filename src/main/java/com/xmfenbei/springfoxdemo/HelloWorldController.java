package com.xmfenbei.springfoxdemo;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @ApiOperation(value="粉丝列表分页接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "当前页数1开始",  dataType = "int",paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页的大小",  dataType = "int",paramType = "query"),
            @ApiImplicitParam(name = "userId", value = "当前登录的用户id", dataType = "int",paramType = "query")
    })
    @RequestMapping(value = "/getFansList" , method = RequestMethod.GET)
    public String getFansPage(@RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                  @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize,
                                  int userId) {

        return "hello world!";
    }
}
