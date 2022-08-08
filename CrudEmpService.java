package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.CrudEmployee;

import com.demo.repo.CrudEmployeeRepository;

@Service
public class CrudEmpService {
@Autowired
private CrudEmployeeRepository repo;

public List<CrudEmployee> fetchEmployeeList(){
	return repo.findAll();
	
}

public   CrudEmployee saveEmployee(CrudEmployee emp)
{
return repo.save(emp);
}

public Optional<CrudEmployee> fetchEmployeeById(int id) {
	return repo.findById(id);
	
}
}
