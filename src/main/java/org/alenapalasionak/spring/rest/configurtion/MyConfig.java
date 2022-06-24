package org.alenapalasionak.spring.rest.configurtion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@ComponentScan("org.alenapalasionak.spring.rest")
@Configuration
public class MyConfig {

    @Bean//бин класса RestTemplate, для совершения HTTP запросов из REST клиента
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
