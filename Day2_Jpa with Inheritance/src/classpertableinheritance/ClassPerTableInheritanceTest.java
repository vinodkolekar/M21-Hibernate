package com.cg.classpertableinheritance;
import javax.persistence.*;

public class ClassPerTableInheritanceTest 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp2 = new Employee();
		//emp.setID(100);
		emp2.setName("Siddhi");
		emp2.setSalary(25000);
		em.persist(emp2);
		
		//create one Employee
		Employee emp3 = new Employee();
		//emp1.setID(271);
		emp3.setName("Shabnam");
		emp3.setSalary(45000);
		em.persist(emp3);
		
		//create one manager
		Manager m1 = new Manager();
		//m.setID(357);
		m1.setName("Sambhaji");
		m1.setSalary(80000);
		m1.setDeptName("Finance");
		em.persist(m1);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in the database");
		em.close();
		//factory.close();
	}
}
