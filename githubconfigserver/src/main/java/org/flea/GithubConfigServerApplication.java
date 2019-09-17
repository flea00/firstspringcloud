package org.flea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: zhaoliang
 * @Date: 2019/9/18 2:01
 * @Description: org.flea
 * @version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class GithubConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GithubConfigServerApplication.class, args);
    }
}
