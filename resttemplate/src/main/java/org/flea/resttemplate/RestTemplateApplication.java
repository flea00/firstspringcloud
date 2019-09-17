package org.flea.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/14 21:05
 * @Description: org.flea.resttemplate
 * @version: 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);
    }

    @LoadBalanced   //负载均衡
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
