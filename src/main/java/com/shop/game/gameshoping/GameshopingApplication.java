package com.shop.game.gameshoping;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = "com.shop.game.gameshoping.dao")
public class GameshopingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameshopingApplication.class, args);
	}
}
