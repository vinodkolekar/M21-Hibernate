package com.cg.dao;
import javax.persistence.EntityManager;
import com.cg.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	// we are going to use EntityManager method- CRUD
	private EntityManager entityManager;
	
	//default constructor
	public EmployeeDaoImpl()
	{
		super();
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	// to add=> persist(object name)
	public void addEmployee(Employee emp) 
	{
		entityManager.persist(emp);
	}

	@Override
	public void updateEmployee(Employee emp) 
	{
		entityManager.merge(emp);
	}

	// to retrieve data=>find(classname, pk)
	@Override
	public Employee getEmployeebyId(int ID) 
	{
		Employee emp = entityManager.find(Employee.class, ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) 
	{
		entityManager.remove(emp);
		
	}
	
	// transaction method to start entity manager 
	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();		
	}

	// transaction method to close entity manager 
	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
	}
}
