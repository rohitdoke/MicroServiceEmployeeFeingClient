package com.justimagine.EmployeeAppFingClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.justimagine.Response.AddressResponse;
@FeignClient(name="addressClient",url = "http://localhost:8081",path="/address-app/api")
public interface AddressClient {

	
	@GetMapping(value="/address/{id}")
	public ResponseEntity<AddressResponse> getAddressByEmpoyeeId(@PathVariable Integer id);
}
