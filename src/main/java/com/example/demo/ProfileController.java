package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/api")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	@GetMapping("/getProfiles")
	public Map<String, Object> getProfiles(){
		Map<String, Object> response = profileService.getProfiles();
		
		return response;
	}
	
	
}
