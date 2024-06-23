package com.example.demo.service;

import java.util.List;



import com.example.demo.pojo.Employee;


public interface EmployeeService {

	public void saveEmp(Employee employee);
	
	public List<Employee> getEmployees();
	
	public Employee getEmployeeById(Integer empId);
	
	public void deleteEmpId(Integer Id);
	
}
