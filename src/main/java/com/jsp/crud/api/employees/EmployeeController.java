package com.jsp.crud.api.employees;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getEmployees();
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return	employeeService.getEmp(id);
	}
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);

	}
	@PutMapping("/employees/{id}")
	public void updateTopic(@RequestBody Employee employee ,@PathVariable int id) {
		employeeService.updateEmployee(employee,id);
	}
	@DeleteMapping("/employees/{id}")
	public void deleteTopic(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
}
