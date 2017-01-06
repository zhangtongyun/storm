package com.yun;

import org.springframework.context.annotation.ImportResource;

//@SpringBootApplication(exclude = {SessionAutoConfiguration.class, DataSourceAutoConfiguration.class, RedisAutoConfiguration.class})
@ImportResource({"classpath:spring/application-context.xml"})
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
