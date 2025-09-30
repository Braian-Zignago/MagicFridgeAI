package dev.java10x.MagicFrigdeIA.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    private final String API_URL = System.getenv("GEMINI_API_URL");


    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder
                .baseUrl(API_URL)
                .build();
    }

}
