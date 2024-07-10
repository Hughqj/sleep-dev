package com.example.sleepdev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzh
 * @date 2022-06-17 16:56
 * @Desc
 */
@RestController
@RequestMapping("/")
public class HealthController {

    @ResponseBody
    @RequestMapping("health")
    public String health() {
        return "200";
    }
    @ResponseBody
    @RequestMapping("health1")
    public String health1() {
        return "2001";
    }

    @ResponseBody
    @RequestMapping("health2")
    public String health2() {
        return "3001";
    }
}
