package com.example.demo.serviceImpl;

import com.example.demo.pojo.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {
	private Logger logger= LoggerFactory.getLogger(EmployeeServiceImp.class);
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public void saveEmp(Employee employee) {
		repository.save(employee); 
		   
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmpId(Integer Id) {
		repository.deleteById(Id);		
	}
	

}
