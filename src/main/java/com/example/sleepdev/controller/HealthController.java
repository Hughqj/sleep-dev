package com.example.sleepdev.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("Healthy", HttpStatus.OK);
    }
    @ResponseBody
    @RequestMapping("health1")
    public String health1() {
        return "2003";
    }

    @ResponseBody
    @RequestMapping("health2")
    public String health2() {
        return "3001";
    }

    @ResponseBody
    @RequestMapping("health3")
    public String health3() {
        return "4002";
    }

    @ResponseBody
    @RequestMapping("health4")
    public String health4() {
        return "5004";
    }
}
