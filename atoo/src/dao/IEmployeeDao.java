package dao;

import java.util.List;

import entity.Employee;

public interface IEmployeeDao {
	public List<Employee> findEmployee(Employee employee);
	public void saveEmployee (Employee employee);
	
	public void updateEmployee(Employee employee);
}
