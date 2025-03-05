package backend.deploy.test.swagger;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.ServletContext;

@Component
public class ServerUrlProvider {

	private final ServletContext servletContext;
    private String host;

    public ServerUrlProvider(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @PostConstruct
    public void init() {
        String detectedHost = servletContext.getVirtualServerName(); // 🔥 Obtiene el host automáticamente

        if (detectedHost == null || detectedHost.isEmpty()) {
            detectedHost = "localhost:8080"; // Valor por defecto
        }

        this.host = detectedHost;
    }

    public String getHost() {
        return host; // 🔥 Retorna solo el host sin el esquema
    }
}
