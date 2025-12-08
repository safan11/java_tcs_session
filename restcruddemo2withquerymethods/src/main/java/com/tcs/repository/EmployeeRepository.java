package com.tcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findByName(String name);
	List<Employee> findByDept(String name);

}
