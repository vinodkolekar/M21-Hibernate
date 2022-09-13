package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.User;

public class UserRepositoryImpl implements IUserRepository
{
	
	private EntityManager entityManager;
	
	
	public UserRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	
	@Override
	public User addNewUser(User user) 
	{
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updatedUser(User user) 
	{
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(long id) 
	{
		entityManager.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();	
	}

	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();	
	}
}
