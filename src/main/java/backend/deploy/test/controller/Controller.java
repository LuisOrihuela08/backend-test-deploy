package backend.deploy.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String hola() {
		return "Hola Luis desde el back";
	}
	
	@PostMapping("/saludo")
	public String saludo() {
		return "Te saludo yo también :)";
	}
}
