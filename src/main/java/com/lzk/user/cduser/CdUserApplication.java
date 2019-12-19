package com.lzk.user.cduser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@MapperScan(basePackages="com.lzk.user.cduser.dao")
public class CdUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdUserApplication.class, args);
	}

}
