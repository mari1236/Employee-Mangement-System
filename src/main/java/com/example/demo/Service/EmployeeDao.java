package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.jpa.employeeRepo;
import com.example.demo.models.Employee;
@Service
public class EmployeeDao implements DAO<Employee>{
	
	@Autowired
	private employeeRepo emp;
	public EmployeeDao(employeeRepo emp)
	{
		this.emp=emp;
	}
	@Override
	public void saveData(Employee t) {
		emp.save(t);
		
	}
	@Override
	public List<Employee> getData() {
	
		return emp.findAll();
	}
	@Override
	public void DeleteData(Long id) {
		emp.deleteById(id);
		
	}
	@Override
	public Optional<Employee> getById(Long id) {
	
		return emp.findById(id);
	}
	@Override
	public Employee update(Employee t) {
	
		return emp.save(t);
	}
	

}
