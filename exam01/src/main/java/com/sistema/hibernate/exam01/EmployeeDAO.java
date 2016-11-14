package com.sistema.hibernate.exam01;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeDAO implements EmployeeDaoInterface {

	public Employee selectById(Long id) {
		  SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();
		 
		    Employee employee = (Employee) session.get(Employee.class, id);
		    
		    session.close();
		    return employee;
	}

	public List<Employee> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Employee> employees = session.createQuery("from employee").list();
	    
	    session.close();
	    return employees;
	}

	public void insert(Employee employee) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(employee);
	         
	    session.getTransaction().commit();	         
	    session.close();
	}

	public void update(Employee employee) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	 
	    session.beginTransaction();
	 
	    session.merge(employee);
	 
	    session.getTransaction().commit();
	    session.close();		
	}

	public void delete(Employee employee) {
		 SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	    
		    session.beginTransaction();
		    
		    session.delete(employee);
		 
		    session.getTransaction().commit();
		    session.close();
		
	}

}
