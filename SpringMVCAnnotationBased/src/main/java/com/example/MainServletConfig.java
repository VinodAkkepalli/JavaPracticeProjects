package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 
 * @author Vinod Akkepalli
 * 
 * Configuration class to replicate servlet configuration xml
 *
 */

@Configuration
@ComponentScan("com.example.mvc")
public class MainServletConfig {
	
	/*
	 * Bean defined that helps in switching view from jsp to other technologies easily
	 */
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
	}

}
