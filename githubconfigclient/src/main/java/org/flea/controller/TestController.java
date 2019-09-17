package org.flea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/17 1:32
 * @Description: org.flea.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort() {
        return this.port;
    }

}
