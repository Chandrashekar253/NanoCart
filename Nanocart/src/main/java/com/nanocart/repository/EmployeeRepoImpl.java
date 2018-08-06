package com.nanocart.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nanocart.model.Employee;
import com.nanocart.repository.util.EmprowMapper;

@Repository("empRepository")
public class EmployeeRepoImpl implements DAOEmployeeRepo{
	
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getEmployees() {

		String sql="select * from Employees";
		List<Employee> employee= jdbcTemplate.query(sql, new EmprowMapper());	
		return employee;
	}
}
