package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.entity.Employee;

@Service
public class ServiceImplements implements EmployeeService {
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public Employee Createmethod(Employee employee) {
		
		return emprepo.save(employee);
	}

	@Override
	public Employee GetEmployeeById(int id) {
		// TODO Auto-generated method stub
		return emprepo.findById(id).orElse(null);
	}

	@Override
	public List<Employee> GetEmployeeAll() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {

	    Employee existing = emprepo.findById(id).orElse(null);

	    if(existing != null) {
	        existing.setName(employee.getName());
	        existing.setDepartment(employee.getDepartment());
	        existing.setIdcard(employee.getIdcard());
	        return emprepo.save(existing);
	    }

	    return emprepo.save(existing);
	}

	@Override
	public void DeleteEmployee(int id) {
		// TODO Auto-generated method stub
		emprepo.deleteById(id);
		
	}

}
