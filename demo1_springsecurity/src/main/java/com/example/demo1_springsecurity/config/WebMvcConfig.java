package com.example.demo1_springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebMvcConfig
 * @Description TODO
 * @Author huangyq
 * @Date 2021/7/2 14:28
 * @Version
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){

        registry.addViewController("/home").setViewName("springsecurity/home");
        registry.addViewController("/").setViewName("springsecurity/welcome");
        registry.addViewController("/login").setViewName("springsecurity/login");
    }
}
