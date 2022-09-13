package com.cg.dao;
import com.cg.entities.Employee;

public interface EmployeeDao 
{
	//as it is interface so by default all the methods are abstract
	void addEmployee(Employee emp); //create
	void updateEmployee(Employee emp); //update
	Employee getEmployeebyId(int ID); //Retrieve     //getEmployeebyId is our user defined method name
	// we are retrieving by id because data can be duplicated but IDs are unique
	void removeEmployee(Employee emp); //remove
	
	void beginTransaction(); // to begin the operation of entity manager
	void commitTransaction(); //to close the operation of entity manager
}
