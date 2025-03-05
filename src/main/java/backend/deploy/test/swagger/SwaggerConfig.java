package backend.deploy.test.swagger;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI custonOpenAPI(HttpServletRequest request) {
		
		String scheme = request.getScheme();//Aca obtengo dinamicamente si es http o https
		String serverUrl = scheme + "://" + request.getServerName();
		
		return new OpenAPI().info(new Info().title("API de prueba para despliegue")
											.version("1.0.0")
											.description("Esta documentacion de API  de prueba para intentar desplegarlo a distintas plataformas - creado por Luiz Beto"))
							.servers(List.of(new Server().url(serverUrl).description("Dynamic Server")));
											
	}
}
