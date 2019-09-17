package org.flea.hystrix.api.impl;

import org.flea.hystrix.api.ProviderFeign;
import org.flea.hystrix.bean.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/15 16:06
 * @Description: org.flea.feign.api.impl
 * @version: 1.0
 */
@Component
public class FeignError implements ProviderFeign {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String getPort() {
        return "feign调用熔断!";
    }
}
