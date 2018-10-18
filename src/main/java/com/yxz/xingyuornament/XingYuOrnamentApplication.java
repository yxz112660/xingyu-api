package com.yxz.xingyuornament;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableFeignClients
@MapperScan(basePackages = "com.yxz.xingyuornament.dataobject.mapper")
@EnableAsync
public class XingYuOrnamentApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(XingYuOrnamentApplication.class, args);
    }
}
