package com.shorelight.studentportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableConfigurationProperties
@EnableSwagger2
@EntityScan(basePackages = {"com.shorelight.studentportal.model"})  // scan JPA entities
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.shorelight.studentportal.controller")).build();
	}

}
