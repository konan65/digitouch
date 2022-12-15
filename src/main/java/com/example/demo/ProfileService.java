package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProfileService {
	
	@Autowired
	private UserRepository userRepository;
	public Map<String, Object> getProfiles(){
		Map<String, Object> response = new HashMap<>();
		
		List<User> userList = userRepository.findAll();
		
		List<Map<String, Object>> resultList = new ArrayList<>();
		Map<String, Object> result = new HashMap<>();
		result.put("id", userList);
		response.put("result", resultList);
		
		return response;
	}
}
