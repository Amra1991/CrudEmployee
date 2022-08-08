package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.demo.entity.CrudEmployee;
import com.demo.service.CrudEmpService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CrudEmployeeController {
    @Autowired
	CrudEmpService service;
    
    
    @GetMapping("/getEmployeeList")
    public List<CrudEmployee> fetchEmployeeListToDB(){
    	List<CrudEmployee> employees=new ArrayList<>();
    	employees=service.fetchEmployeeList();
    	System.out.println("got product list");
		return employees;
    	
    }
    @PostMapping("/addEmployeeList")
    public CrudEmployee saveEmployeeToDB(@RequestBody CrudEmployee employee) {
		return service.saveEmployee(employee);
    	
    }
    
    @GetMapping("/getEmployeeById/{id}")
    public CrudEmployee fetchEmployeeByIdToDB(@PathVariable int id) {
    	return service.fetchEmployeeById(id).get();
 	  
 	      }
	
}
