package com.jsp.crud.api.employees;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	public List<Employee> getEmployees(){
		List<Employee> emp=new ArrayList<Employee>();
		employeeRepository.findAll().forEach(emp::add);
		return emp;
	}
	public Employee getEmp(int id) {
		return employeeRepository.findById(id).orElse(null);
	}
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	public void updateEmployee(Employee employee,int id) {
		employeeRepository.save(employee);
	}
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}


}
