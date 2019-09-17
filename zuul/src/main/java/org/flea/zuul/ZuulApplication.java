package org.flea.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/15 2:56
 * @Description: org.flea.zuul
 * @version: 1.0
 */
@EnableZuulProxy    //包含了@EnableZuulServer，设置该类是网关的启动类
@EnableAutoConfiguration    //将所有符合条件的@Configuration 配置加载到当前使用的IoC容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
