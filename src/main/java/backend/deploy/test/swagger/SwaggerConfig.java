package backend.deploy.test.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI custonOpenAPI() {
		return new OpenAPI().info(new Info().title("API de prueba para despliegue")
											.version("1.0.0")
											.description("Esta documentacion de API  de prueba para intentar desplegarlo a distintas plataformas - creado por Luiz Beto"));
	}
}
