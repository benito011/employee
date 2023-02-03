package com.emp.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.demo.entity.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> employee = new ArrayList<Employee>();

	public static   List<Employee> getAll() {
		return employee;
	}

	}



