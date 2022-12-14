package com.justimagine.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.justimagine.Response.EmployeeResponse;
import com.justimagine.Service.EmpServiceInterface;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmpServiceInterface service;
	
	
	
	@GetMapping(value="/emp/{id}")
	public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") Integer id)
	{
		
		
		
		
		EmployeeResponse empResponse = service.getEmployeeById(id);	
		
		
		
		return ResponseEntity.status(HttpStatus.OK).body(empResponse);
	}
	
}
