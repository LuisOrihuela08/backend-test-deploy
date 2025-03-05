package backend.deploy.test.swagger;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class SwaggerConfig {


	@Bean
    public OpenAPI customOpenAPI() {
		 // Obtener la solicitud actual
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String url = "http://localhost:8080"; // Valor por defecto

        if (attributes != null) {
            HttpServletRequest request = attributes.getRequest();
            String scheme = request.isSecure() ? "https" : "http";
            String host = request.getServerName();
            int port = request.getServerPort();
            url = scheme + "://" + host + (port != 80 && port != 443 ? ":" + port : "");
        }

        return new OpenAPI()
                .info(new Info()
                        .title("API de prueba para despliegue")
                        .version("1.0.0")
                        .description("Esta documentación de API de prueba para intentar desplegarlo en distintas plataformas - creado por Luiz Beto"))
                .servers(Collections.singletonList(new Server().url(url).description("Auto-detected server")));
    }

}
