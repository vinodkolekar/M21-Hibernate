package com.cg.client;


import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.AdminServiceImpl;
import com.cg.service.IAdminService;
import com.cg.service.IPlacementService;
import com.cg.service.IStudentService;
import com.cg.service.PlacementServiceImpl;
import com.cg.service.StudentServiceImpl;


public class Client 
{
	public static void main(String args[])
	{
		//Student input
		Student student = new Student();
		IStudentService service = new StudentServiceImpl();
	    student.setId(101);
		student.setName("Vishwanath");
		student.setCollege("PCCOE");
		student.setRoll(01);
		student.setQualification("BE");
		student.setCourse("CS");
		student.setYear(2021);
		student.setHallTicketNo(1001);
		
		//Certificate input
		Certificate c=new Certificate();
		c.setId(201);
		c.setYear(2021);
		

		student.setCertificate(c);
		c.setStudent(student);
		
		
		service.addStudent(student);
		
		
		//college table input
		College col=new College();
		col.setId(301);
		col.setCollegeName("PCCOE");
		col.setLocation("Pune");
		
		//placement table input
		Placement p=new Placement();
		IPlacementService placement =new PlacementServiceImpl();
		p.setId(401);
		LocalDate date=LocalDate.now();
		p.setDate(date);
		p.setQualification("BE");
		p.setCollege(col);
		p.setName("placement drive");
		p.setYear(2022);
		placement.addPlacement(p);
		
		
		col.setCollegeName("MIT");
	    p.setCollege(col);
	    
	   
	    placement.addPlacement(p);
	    
		
		//User table input
		User u=new User();
		u.setId(501);
		u.setName("Vinod");
		u.setType("New User");
		u.setPassword("vinod123");
		
		//Admin input
		Admin a=new Admin();
		IAdminService ad=new AdminServiceImpl();
	    a.setId(7063);
		a.setName("Bhakti");
		a.setPassword("bhakti1234");
		
		
		u.setAdmin(a);
	    a.setUser(u);
		
	    
	    ad.addNewAdmin(a);
	    
	    	
		System.out.println("Data is inserted");
		
		System.out.println("Updated successfully");
		
	}

}