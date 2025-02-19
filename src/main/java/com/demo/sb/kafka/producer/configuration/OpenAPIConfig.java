package com.demo.sb.kafka.producer.configuration;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Kafka Producer API",
        version = "1.0",
        description = "Spring Boot 3 | Kafka Producer Demo Project"
    )
)
public class OpenAPIConfig {

}