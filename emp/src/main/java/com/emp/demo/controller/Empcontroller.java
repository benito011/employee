package com.emp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.demo.entity.Employee;
import com.emp.demo.service.EmpService;


@RestController
@RequestMapping("/emp")
public class Empcontroller {
	
	@Autowired
	EmpService EmpService;
	
	
    @GetMapping("/get/all")
    public List<Employee> getAll(){
    	return EmpService.getAll();
    }

}
