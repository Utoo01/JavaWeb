package service;

import java.util.List;

import dao.EmployeeDao;

import entity.Employee;

public class EmployeeService implements IEmployeeService{

	EmployeeDao  employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public List<Employee> findEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return employeeDao.findEmployee(employee);
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.saveEmployee(employee);
	}

	
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}
	
	

	
	
	
}
