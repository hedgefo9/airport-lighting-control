package com.logo.Lights;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("com.logo")
public class ResourceConfig extends WebMvcConfigurerAdapter{
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/webres/css/**").addResourceLocations("/webres/css/");
		registry.addResourceHandler("/webres/img/**").addResourceLocations("/webres/img/");
		registry.addResourceHandler("/webres/js/**").addResourceLocations("/webres/js/");
		registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
	}
}
