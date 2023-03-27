package com.SwaggerDemoPackage.swaggerconfig;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@OpenAPIDefinition
@Configuration
public class SwaggerConfig {

	public OpenAPI baseApiDoc() {
		return new OpenAPI().info(new Info().title("The Med Router").version("1.0.0").description("Med Project"));
	}
}
