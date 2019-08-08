package com.wisely.ch5_2_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class}关闭自动配置) springboot的核心注解，主要目的是开启自动配置
public class SetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetupApplication.class, args);
	}

}
