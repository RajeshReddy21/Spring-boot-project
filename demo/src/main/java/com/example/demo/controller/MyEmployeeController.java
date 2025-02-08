package com.example.demo.controller;

import com.example.demo.pojo.Employee;
import com.example.demo.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MyEmployeeController {
	
	 private Logger logger= LoggerFactory.getLogger(MyEmployeeController.class);
	  @Autowired
	  private EmployeeService service ;
	
	@PostMapping("/saveemp")
	public String savemployee( @RequestBody Employee employee) {
		
		  if(employee !=null) {
			  service.saveEmp(employee);
			  logger.info("Employee details Successfylly Saved "+ employee);
			  return "Congratulation Your Successfylly Saved...!";
		  }else {
			  logger.info("Employee details not save "+ employee);
			 return "Sorry You are not saved....!";
		  }
	}
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployees(){
		return service.getEmployees();
		
	}
	@DeleteMapping("/deleteId/{id}")
	public void deletebyId(@PathVariable(value = "id") Integer Id) {
		  service.deleteEmpId(Id);
		 logger.info(" Employee Deleted Successfully with Id = "+Id);
	}
}
