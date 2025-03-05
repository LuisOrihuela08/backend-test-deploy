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
		 // Valor por defecto (para evitar problemas si no hay una solicitud HTTP disponible)
        String url = "http://localhost:8080";

        // Obtener la solicitud actual (solo funciona dentro de un request)
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            HttpServletRequest request = attributes.getRequest();
            String scheme = request.getHeader("X-Forwarded-Proto"); // Detectar si viene de un proxy inverso
            if (scheme == null) {
                scheme = request.isSecure() ? "https" : "http"; // Si no hay header, usar método estándar
            }

            String host = request.getServerName();
            int port = request.getServerPort();

            // Construir la URL con protocolo dinámico
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
