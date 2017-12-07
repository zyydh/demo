package com.alibaba.edas.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
//导入HSF配置文件
@ImportResource(locations={"classpath:hsf-provider-beans.xml"})
@SpringBootApplication
public class StartupDemoApplication {

	public static void main(String[] args) {
		//启动服务
		SpringApplication.run(StartupDemoApplication.class, args);
	}
}
