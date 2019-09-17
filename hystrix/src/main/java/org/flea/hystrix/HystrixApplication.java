package org.flea.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/15 16:38
 * @Description: org.flea.hystrix
 * @version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker   //声明启用数据监控
@EnableHystrixDashboard //声明启用可视化的数据监控
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}
