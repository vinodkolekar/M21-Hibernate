package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		//lazy initialization
		Employee emp = new Employee();
		EmployeeService service = new EmployeeServiceImpl();
		
		// create operation
//		emp.setID(102);
//		emp.setNAME("Shabnam");
//		service.addEmployee(emp);
		
//		// retrieve operation
//		emp= service.getEmployeebyId(102);
//		System.out.println("Employee Id: " +emp.getID());
//		System.out.println("Employee Name: " +emp.getNAME());
//		
		// update operation
		emp= service.getEmployeebyId(102);
		emp.setNAME("Ashlesha");
		service.updateEmployee(emp);
		
	    //retrieve operation
		emp= service.getEmployeebyId(102);
		service.removeEmployee(emp);
		
		
	}
}
