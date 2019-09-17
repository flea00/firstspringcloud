package org.flea.hystrix.controller;

import org.flea.hystrix.api.ProviderFeign;
import org.flea.hystrix.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/15 16:45
 * @Description: org.flea.hystrix.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    private ProviderFeign providerFeign;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return providerFeign.findAll();
    }

    @GetMapping("/getPort")
    public String getPort() {
        return providerFeign.getPort();
    }
}
