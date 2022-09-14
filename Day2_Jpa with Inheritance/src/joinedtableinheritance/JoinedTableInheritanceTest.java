package com.cg.joinedtableinheritance;
import javax.persistence.*;

public class JoinedTableInheritanceTest 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp4 = new Employee();
		//emp.setID(100);
		emp4.setName("Raviraj");
		emp4.setSalary(25000);
		em.persist(emp4);
		
		//create one Employee
		Employee emp5 = new Employee();
		//emp1.setID(271);
		emp5.setName("Vinod");
		emp5.setSalary(45000);
		em.persist(emp5);
		
		//create one manager
		Manager m2 = new Manager();
		//m.setID(357);
		m2.setName("Mahendra");
		m2.setSalary(80000);
		m2.setDeptName("IT");
		em.persist(m2);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in the database");
		em.close();
		//factory.close();
	}
}
