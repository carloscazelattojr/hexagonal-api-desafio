package br.com.carlosjunior.boletojuros.application;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Juros Boleto")
                        .description("API para calcular juros de boleto vencidos")
                        .contact(new Contact()
                                .name("Carlos Jr")
                                .email("carlosjunior1983@gmail.com"))
                        .version("1.0.0")
                );
    }
}