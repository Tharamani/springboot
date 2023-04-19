package com.javalearning.springboot.crudemployeedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearning.springboot.crudemployeedemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//that's it... no need to write any code
}
