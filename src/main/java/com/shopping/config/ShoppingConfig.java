package com.shopping.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.shopping.")
public class ShoppingConfig {
	
	@Bean
	public InternalResourceViewResolver getView()
	{
		InternalResourceViewResolver internal=new InternalResourceViewResolver();
		internal.setPrefix("/WEB-INF/views/");
		internal.setSuffix(".jsp");
		return internal;
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assests/**")
          .addResourceLocations("/assests/"); 
    }

}
