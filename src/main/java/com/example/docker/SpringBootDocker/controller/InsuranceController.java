package com.example.docker.SpringBootDocker.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class InsuranceController {

	private static List<String> insuranceList = new ArrayList<String>();
	
	@PostMapping("/insurance")
	public ResponseEntity<?> insertInsurance(final @RequestBody Map<String, Object> insuranceMap) {
		if(insuranceMap.containsKey("name") && insuranceMap.get("name") != null) {
			insuranceList.add(insuranceMap.get("name").toString());
			return new ResponseEntity<>(insuranceList, HttpStatus.OK);
		}
		
		return new ResponseEntity<>("'name' is required.", HttpStatus.BAD_REQUEST);
	}
}
