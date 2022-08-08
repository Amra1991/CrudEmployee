package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.CrudEmployee;

public interface CrudEmployeeRepository extends JpaRepository<CrudEmployee,Integer>{

}
