package org.flea.hystrix.api;

import org.flea.hystrix.api.impl.FeignError;
import org.flea.hystrix.bean.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/15 15:31
 * @Description: org.flea.feign.api
 * @version: 1.0
 */
@FeignClient(value = "provider", path = "/student", fallback = FeignError.class)
public interface ProviderFeign {

    @GetMapping("/findAll")
    Collection<Student> findAll();

    @GetMapping("/getPort")
    String getPort();
}
