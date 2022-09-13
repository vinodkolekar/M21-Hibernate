package com.cg.dao;
import javax.persistence.*;

public class JPAUtil 
{
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	static
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU"); // we use writing the name of our persistence unit (to use ORM concepts)
	}
	
	public static EntityManager getEntityManager()
	{
		if(entityManager==null || !entityManager.isOpen())
		{
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
}
