package backend.deploy.test.swagger;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

	private final ServerUrlProvider serverUrlProvider;

    public SwaggerConfig(ServerUrlProvider serverUrlProvider) {
        this.serverUrlProvider = serverUrlProvider;
    }

    @Bean
    public OpenAPI customOpenAPI() {
    	String baseUrl = serverUrlProvider.getHost(); // 🔥 Obtiene solo el host
    	
        return new OpenAPI()
                .info(new Info()
                        .title("API de prueba para despliegue")
                        .version("1.0.0")
                        .description("Esta documentación de API de prueba para intentar desplegarlo en distintas plataformas - creado por Luiz Beto"))
                .servers(List.of(new Server().url("http://" + baseUrl).description("HTTP Server"),
                				new Server().url("https://" + baseUrl).description("HTTPS Server")));
    }

}
