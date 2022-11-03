package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeDao;
import com.example.demo.models.Employee;
@RestController
@RequestMapping("api/employee")
public class EmpController {
	
	private EmployeeDao eDao;
	public EmpController(EmployeeDao eDao)
	{
		this.eDao=eDao;
		
	}
	@PostMapping("/addData")
	
	public void AddData(@RequestBody Employee e)
	{
		eDao.saveData(e);
	}
	@GetMapping("/readData")
	public List<Employee> getAll()
	{
		return eDao.getData();
	}
	@PutMapping("/updateData")
	public Employee UdateData(@RequestBody Employee e)
	{
		return eDao.update(e);
	}
	@DeleteMapping("/deleteData/{id}")
	public void DeleteData(@PathVariable("id") Long id)
	{
		eDao.DeleteData(id);
	}
	@GetMapping("/readDataById/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id") Long id)
	{
		return eDao.getById(id);
	}
	
	

}
