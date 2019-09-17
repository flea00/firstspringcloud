package org.flea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/17 1:16
 * @Description: org.flea
 * @version: 1.0
 */
@SpringBootApplication
@EnableConfigServer //声明配置中心
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class, args);
    }
}
