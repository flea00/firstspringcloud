package org.flea.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/14 16:06
 * @Description: org.flea.provider
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = {"org.flea.provider.dao"})
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
