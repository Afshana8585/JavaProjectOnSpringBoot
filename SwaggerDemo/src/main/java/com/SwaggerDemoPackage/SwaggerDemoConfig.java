package com.SwaggerDemoPackage;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerDemoConfig {
	
	@GetMapping("home")
	String display() {
		return("<h1>displaying security demo<h1>");
	}
	
	@GetMapping("/index")
	String display2() {
		return("<h1>index page<h1>");
	}
	

	@GetMapping("/dashbord")
	String display3() {
		return("<h1>dashboard<h1>");
	}
	

	@GetMapping("/input")
	String display4() {
		return("<h1> hi how r u <h1>");
	}
}
