package cn.tjmj.serviceshopping;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.util.Properties;

@Controller
@Configuration
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan(basePackages={"cn.tjmj.serviceshopping.dao"})
public class ServiceShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceShoppingApplication.class, args);
	}


        //配置mybatis的分页插件pageHelper
        @Bean
        public PageHelper pageHelper(){
              PageHelper pageHelper = new PageHelper();
              Properties properties = new Properties();
               properties.setProperty("offsetAsPageNum","true");
                properties.setProperty("rowBoundsWithCount","true");
                properties.setProperty("reasonable","true");
                properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
                 pageHelper.setProperties(properties);
                 return pageHelper;
             }
}
