package com.itheima.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVCconfig implements WebMvcConfigurer {
    //修改地址
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("地址").setViewName("地址");
        registry.addViewController("地址").setViewName("地址");
    }

}
