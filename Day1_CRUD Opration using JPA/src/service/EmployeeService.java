package com.cg.service;

import com.cg.entities.Employee;

public interface EmployeeService 
{
	//as it is interface so by default all the methods are abstract
	void addEmployee(Employee emp); //create
	void updateEmployee(Employee emp); //update
	Employee getEmployeebyId(int ID); //Retrieve     //getEmployeebyId is our user defined method name
	// we are retrieving by id because data can be duplicated but IDs are unique
	void removeEmployee(Employee emp); //remove
}
