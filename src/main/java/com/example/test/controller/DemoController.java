package com.example.test.controller;


import com.demo.starter.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述：
 *
 * @Author shf
 * @Description TODO
 * @Date 2019/5/13 15:52
 * @Version V1.0
 **/
@RestController
public class DemoController {
    @Resource(name = "demo")
    private DemoService demoService;

    @GetMapping("/say")
    public String sayWhat() {
        return demoService.say();
    }

}