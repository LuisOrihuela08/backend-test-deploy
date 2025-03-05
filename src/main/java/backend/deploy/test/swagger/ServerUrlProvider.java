package backend.deploy.test.swagger;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.ServletContext;

@Component
public class ServerUrlProvider {

	private final ServletContext servletContext;
    private String serverUrl;

    public ServerUrlProvider(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @PostConstruct
    public void init() {
        String scheme = servletContext.getInitParameter("scheme");
        String host = servletContext.getInitParameter("host");

        if (scheme == null || host == null) {
            // Si no están definidos, usa valores por defecto
            scheme = "http"; // Cambia a "https" si deseas que sea seguro por defecto
            host = "localhost:8080";
        }

        this.serverUrl = scheme + "://" + host;
    }

    public String getServerUrl() {
        return serverUrl;
    }
}
