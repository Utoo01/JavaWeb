package service;

import java.util.List;

import entity.Employee;

public interface IEmployeeService {

	
	public List<Employee> findEmployee(Employee employee);
	
	public void  saveEmployee (Employee employee);
	
	public void updateEmployee (Employee employee);
}
