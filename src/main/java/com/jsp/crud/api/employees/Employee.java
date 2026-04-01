package com.jsp.crud.api.employees;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private float salary;
	private String address;
	public Employee() {}
	public Employee(int id, String name, float salary, String address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address=address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}

}
