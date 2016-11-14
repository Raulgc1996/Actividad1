package com.sistema.hibernate.exam01;

import java.io.Serializable;
import java.util.List;




public interface EmployeeDaoInterface {
	public Employee selectById(Long id);
	public List<Employee> selectAll ();
	public void insert (Employee employee);
	public void update (Employee employee);
	public void delete (Employee employee);
}
