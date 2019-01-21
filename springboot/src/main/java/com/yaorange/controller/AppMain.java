package com.yaorange.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 *1.启动tomcat,
 *2.启动web项目，加载web.xml,
 *3.扫描spring相关的xml文件->mapper,service,controller加载到spring容器中
 */
@SpringBootApplication
@ComponentScan("com.yaorange")
public class AppMain {
	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}
}
