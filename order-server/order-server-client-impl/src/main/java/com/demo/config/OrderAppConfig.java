package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yeyu
 * @since 2022-06-17 16:33
 */
@Configuration
public class OrderAppConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
