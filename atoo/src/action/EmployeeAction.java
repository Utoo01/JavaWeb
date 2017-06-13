package action;

import java.util.List;

import service.EmployeeService;

import com.opensymphony.xwork2.ActionSupport;

import entity.Employee;

public class EmployeeAction extends  ActionSupport{

	String finish_Url;
	public String getFinish_Url() {
		return finish_Url;
	}
	public void setFinish_Url(String finish_Url) {
		this.finish_Url = finish_Url;
	}

	EmployeeService employeeService;
	List<Employee>  employees;
	Employee employee;
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	public String findEmployee (){
	
		employees = employeeService.findEmployee(employee);
		return "findEmployee";
	}
	
	public String  saveEmployee(){
		
		employeeService.saveEmployee(employee);
		finish_Url ="employeeAction!findEmployee.action";
		return "finish";
		
	}
	
				 //preUpadateEmployee 访问不到
	public  String preUpdateEmployee (){
		System.out.println("preUpdateEmployee");
		System.out.println("id="+employee.getId());
		//employee 此时只有id  employee.jsp传递过来
		employee  =employeeService.findEmployee(employee).get(0);
		return "updateEmployee";
	}
	
	public String updateEmployee (){
		
		System.out.println("进入到了updateEmployee ");
		employeeService.updateEmployee(employee);
		
		finish_Url="employeeAction!findEmployee.action";
		return "finish";
	}
}
