package com.sistema.hibernate.exam01;

public class Employee {
private long id;
private String name;
private String email;
private float salary;

public Employee(String name, String email, float salary) {
	this.name = name;
	this.email = email;
	this.salary = salary;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
