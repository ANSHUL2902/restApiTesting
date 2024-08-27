package com.app.bajajTest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.bajajTest.model.RequestModel;
import com.app.bajajTest.model.ResponseModel;

@Service
public class Bfhlservice {

	public ResponseModel processData(RequestModel request) {
		
		List <String> numbers = new ArrayList();
		List <String> alphabates = new ArrayList();
		
		
		for (String item : request.getData()) {
			
			if (item.matches("[0-9]+")) {
				numbers.add(item);
				
			}else if(item.matches("[a-zA-Z]+")) {
				alphabates.add(item);
			}
			
		}
			String userId = request.getFullName().toLowerCase().replace(" ", "_")+"_"+request.getDob();
			
			ResponseModel response = new ResponseModel();
			
			response.setStatus(true);
			response.setUserId(userId);
			response.setEmail(request.getEmail());
			response.setRollNo(request.getRollNo());
			response.setNumbers(numbers);
			response.setAlphabates(alphabates);
			
			return response;
		
		
	}
	
}
