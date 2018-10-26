package com.example.usercenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类功能说明：模拟用户中心服务测试
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @作者： shoddon
 * @创建时间： 2018/10/24 17:27
 * @版本：V1.0
 */
@RequestMapping("/hello")
@RestController
public class UserCenterController {

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name)  {
        System.out.println("the name is " + name);
        return "the name is " + name;
    }
}
