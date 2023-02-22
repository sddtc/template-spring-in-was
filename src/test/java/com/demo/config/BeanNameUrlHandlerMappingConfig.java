package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;

import com.demo.web.controller.handlermapping.WelcomeController;

@Configuration
public class BeanNameUrlHandlerMappingConfig {

    @Bean
    BeanNameUrlHandlerMapping beanNameUrlHandlerMapping() {
        return new BeanNameUrlHandlerMapping();
    }

    @Bean("/beanNameUrl")
    public WelcomeController welcomeBeanNameMappingConfig() {
        return new WelcomeController();
    }

}
