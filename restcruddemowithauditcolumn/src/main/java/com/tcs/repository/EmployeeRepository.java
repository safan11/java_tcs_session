package com.tcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tcs.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	// query methods (query generation will be automatic by data jpa at runtime)
	Employee findByName(String name);
	List<Employee> findByDept(String dept);
	List<Employee> findByAgeLessThan(int age);
	
	
	//jpql query
	@Query(" SELECT e FROM Employee e WHERE e.dept = :deptName")
	List<Employee> getEmployeesByDept(@Param("deptName") String dept);


}
