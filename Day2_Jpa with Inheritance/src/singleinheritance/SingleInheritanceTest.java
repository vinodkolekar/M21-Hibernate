package com.cg.singleinheritance;
import javax.persistence.*;

public class SingleInheritanceTest 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp = new Employee();
		//emp.setID(100);
		emp.setName("Janhvi");
		emp.setSalary(25000);
		em.persist(emp);
		
		//create one Employee
		Employee emp1 = new Employee();
		//emp1.setID(271);
		emp1.setName("Krishna");
		emp1.setSalary(45000);
		em.persist(emp1);
		
		//create one manager
		Manager m = new Manager();
		//m.setID(357);
		m.setName("Parag");
		m.setSalary(80000);
		m.setDeptName("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in the database");
		em.close();
		//factory.close();
	}
}