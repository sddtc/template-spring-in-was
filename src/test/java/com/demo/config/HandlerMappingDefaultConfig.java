package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.web.controller.handlermapping.BeanNameHandlerMappingController;
import com.demo.web.controller.handlermapping.WelcomeController;


@Configuration
public class HandlerMappingDefaultConfig {

    @Bean("/welcome")
    public BeanNameHandlerMappingController beanNameHandlerMapping() {
        return new BeanNameHandlerMappingController();
    }

    @Bean
    public WelcomeController welcomeDefaultMappingConfig() {
        return new WelcomeController();
    }

}
