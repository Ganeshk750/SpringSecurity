package com.ganesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourseHome {
	@GetMapping("/")
    public String hello() {
    	return "<h2>Wel Come To Spring World!!</h2>";
    }
	
	@GetMapping("/user")
    public String user() {
    	return "<h2>Wel Come To User In Spring World!!</h2>";
    }
	
	@GetMapping("/admin")
    public String admin() {
    	return "<h2>Wel Come To Admin In Spring World!!</h2>";
    }
}
