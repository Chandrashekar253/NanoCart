package com.nanocart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nanocart.model.Employee;
import com.nanocart.repository.DAOEmployeeRepo;
import com.nanocart.service.DAOEmployee;

@Service("empService")
public class ServiceImpl implements DAOEmployee {

	@Autowired
	DAOEmployeeRepo empRepository;

	@Override
	public List<Employee> getEmployees() {

		return empRepository.getEmployees();
	}

}
