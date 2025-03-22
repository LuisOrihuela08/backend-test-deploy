package backend.deploy.test.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {


	@Bean
	public OpenAPI custonOpenAPI() {
		return new OpenAPI().info(new Info().title("API DEPLOY TEST")
											.version("1.0.0")
											.description("Esta documentación es para realizar pruebas de despliegue en distintas plataformas y servicios")
											.contact(new Contact()
													.name("Hecho por Luis Beto")
													.email("orihuelao.luis@gmail.com")));
	}

}
