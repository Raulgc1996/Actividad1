package com.sistema.hibernate.exam01;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee employee1 = new Employee("Pepe","Pepe@pepe.com",640.00f);
       Employee employee2 = new Employee("Pepa","Pepa@pepa.com",640.00f);
       EmployeeDAO dao = new EmployeeDAO();
       dao.insert(employee1);
       dao.insert(employee2);
     List<Employee> employees=  dao.selectAll();
     System.out.println("--- Employee ----- table contents	-----------");
       for (Employee employee : employees){
    	   System.out.println("Id: " + employee.getId());
    	   System.out.println("Name: " + employee.getName());
    	   System.out.println("Email: " + employee.getEmail());
    	   System.out.println("Salary: " + employee.getSalary());
       }
    }
}
