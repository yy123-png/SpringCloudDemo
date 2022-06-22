package com.yy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yeyu
 * @since 2022-06-22 11:43
 */
@Configuration
public class OrderConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
