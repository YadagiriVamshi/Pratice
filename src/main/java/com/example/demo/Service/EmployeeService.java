package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	Employee Createmethod(Employee employee);
	Employee GetEmployeeById(int id);
	List<Employee> GetEmployeeAll();
	Employee updateEmployee(int id,Employee employee);
	void DeleteEmployee(int id);
	
}
