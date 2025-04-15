package com.thejoa.boot003.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {

	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	// localhost:8080/test
}
