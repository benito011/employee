package com.emp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.demo.entity.Employee;
import com.emp.demo.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	EmpRepository empRepository;
	
	public  List<Employee> getAll() {
		return EmpRepository.getAll();
		
	}
	
	

}
