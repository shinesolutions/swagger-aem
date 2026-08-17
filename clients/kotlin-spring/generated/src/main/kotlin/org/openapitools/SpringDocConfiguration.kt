package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Adobe Experience Manager (AEM) API")
                    .description("Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API")
                    .contact(
                        Contact()
                            .name("Shine Solutions")
                            .url("https://github.com/shinesolutions")
                            .email("opensource@shinesolutions.com")
                    )
                    .version("3.7.1-pre.0")
            )
            .components(
                Components()
                    .addSecuritySchemes("aemAuth", SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("basic")
                    )
            )
    }
}
