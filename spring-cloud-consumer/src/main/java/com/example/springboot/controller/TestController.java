package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类功能说明：微服务测试
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @作者： shoddon
 * @创建时间： 2018/10/24 17:21
 * @版本：V1.0
 */
@RequestMapping("/hello")
@RestController
public class TestController {

    @GetMapping("")
    public String hello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
