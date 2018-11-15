package cn.tjmj.commoneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务的注册中心，
 */
@EnableEurekaServer
@SpringBootApplication
public class CommonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonEurekaServerApplication.class, args);
	}
}
