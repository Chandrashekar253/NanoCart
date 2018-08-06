package com.nanocart.repository.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nanocart.model.Employee;

public class EmprowMapper implements RowMapper<Employee>{
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee emp=new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setEmail(rs.getString(3));
		return emp;
	}

}
