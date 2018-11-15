package cn.tjmj.commoneurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 注册服务，提供服务
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CommonEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonEurekaClientApplication.class, args);
	}
}
