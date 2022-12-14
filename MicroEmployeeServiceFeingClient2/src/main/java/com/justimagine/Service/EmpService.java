package com.justimagine.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.justimagine.EmployeeAppFingClient.AddressClient;
import com.justimagine.Entity.Employee;
import com.justimagine.Repo.EmployeeRepo;
import com.justimagine.Response.AddressResponse;
import com.justimagine.Response.EmployeeResponse;

@Service
public class EmpService implements EmpServiceInterface {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private AddressClient addressClient;	
	
	
	
	@Override
	public EmployeeResponse getEmployeeById(Integer id)
	{
		
			Employee emp = empRepo.findById(id).orElseThrow();
			
		
			EmployeeResponse empResponse = modelMapper.map(emp, EmployeeResponse.class);
			
		AddressResponse addressResponse = addressClient.getAddressByEmpoyeeId(id).getBody();
		
			
			empResponse.setAddressresponse(addressResponse);
			return empResponse;
		
	}

	

}