package com.docker.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
	
	
	@GetMapping("api/docker/response")
	public String testResponse() {
		return "Docker Deployment API Response successfull";
	}

}
