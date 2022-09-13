package com.cg.classpertableinheritance;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="EMP_Table1")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Employee implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String Name;
	private double Salary;
	
	public int getID() 
	{
		return ID;
	}
	public void setID(int iD) 
	{
		ID = iD;
	}
	
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	
	public double getSalary() 
	{
		return Salary;
	}
	public void setSalary(double salary) 
	{
		Salary = salary;
	}
}
