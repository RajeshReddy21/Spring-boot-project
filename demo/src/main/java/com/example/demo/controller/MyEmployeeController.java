package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Employee;
import com.example.demo.service.EmployeeService;


@RestController
public class MyEmployeeController {
	
	 
	  @Autowired
	  private EmployeeService service ;
	
	@PostMapping("/saveemp")
	public String savemployee( @RequestBody Employee employee) {
		
		  if(employee !=null) {
			  service.saveEmp(employee);
			  return "Congratulation Your Successfylly Saved...!";
		  }else {
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
	}
	@GetMapping("/getUser/{id}")
	public List<Employee> getEmployeeById(@PathVariable Integer id){
		System.out.println("Added sys out");
		return null;
	}
}

