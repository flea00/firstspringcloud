package org.flea.feign.controller;

import org.flea.feign.api.ProviderFeign;
import org.flea.feign.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/15 15:39
 * @Description: org.flea.feign.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {

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
