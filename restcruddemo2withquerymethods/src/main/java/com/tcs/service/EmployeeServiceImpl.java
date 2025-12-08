package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.Employee;
import com.tcs.exception.IdNotFoundException;
import com.tcs.exception.InValidAgeException;
import com.tcs.repository.EmployeeRepository;
import com.tcs.util.AppConstant;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee addEmployee(Employee employee) throws InValidAgeException {
		
		if(employee.getAge()<22)
			throw new InValidAgeException(AppConstant.AGE_INVALID_MESSAGE);
		
		return employeeRepository.save(employee);
	}

	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	/**
	 * Description: this method is used to find the employee by id
	 * @param : It takes int id as param 
	 * @return : It returns employee objects. 
	 * @throws : It throws Id not found exception 
	 * @author safan 
	 * @CreatedDate :  12 Dec 2025 
	 * 
	 */
	@Override
	public Employee getEmployeeById(int id) throws IdNotFoundException {
		return employeeRepository.findById(id).orElseThrow(()->new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE));
	}
	
	
	/**
	 * Delete employee by id
	 */
     @Override
	public String deleteEmployeeById(int id) throws IdNotFoundException {
		
	   if(!employeeRepository.existsById(id))
		    throw new IdNotFoundException("No Id present to delete");
		 
	    employeeRepository.deleteById(id);
		
		return "employee with the id :"+ id +" is deleted";
	}

	
	
	
	@Override
	public Employee updateEmployeeById(int id, Employee employee) throws IdNotFoundException {
		    
		Employee employee2=   employeeRepository.findById(id).orElseThrow(()-> new IdNotFoundException("no id found to update"));
		 employee2.setName(employee.getName());  
		 employee2.setDept(employee.getDept());
		 employee2.setSalary(employee.getSalary());
		 employee2.setAge(employee.getAge());
		 employeeRepository.save(employee2);
		return employee2;
	}

}
