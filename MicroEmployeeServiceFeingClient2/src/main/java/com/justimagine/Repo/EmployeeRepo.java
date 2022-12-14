package com.justimagine.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.justimagine.Entity.Employee;
@Repository
public interface EmployeeRepo  extends JpaRepository<Employee, Integer> {

	
	
}
