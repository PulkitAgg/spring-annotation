package com.pulkit.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.pulkit.SpringAnnotation") // use comma separated package name if we have more than 2
public class AppConfig {
	
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragon();
//	}
}
