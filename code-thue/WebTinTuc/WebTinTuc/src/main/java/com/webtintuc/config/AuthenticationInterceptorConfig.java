package com.webtintuc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.webtintuc.interceptor.AdminAuthenticationInterceptor;
import com.webtintuc.interceptor.CustomerAuthenticationInterceptor;



@Configuration
public class AuthenticationInterceptorConfig implements WebMvcConfigurer{
	@Autowired
	AdminAuthenticationInterceptor adminAuthenticationInterceptor;
	@Autowired
	CustomerAuthenticationInterceptor customerAuthenticationInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(adminAuthenticationInterceptor)
			.addPathPatterns("/add");
		registry.addInterceptor(adminAuthenticationInterceptor)
		.addPathPatterns("/edit/**");
		registry.addInterceptor(adminAuthenticationInterceptor)
		.addPathPatterns("/delete/**");
		registry.addInterceptor(adminAuthenticationInterceptor)
		.addPathPatterns("/list");
	}

}
