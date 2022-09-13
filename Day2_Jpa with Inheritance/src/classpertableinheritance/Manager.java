package com.cg.classpertableinheritance;
import javax.persistence.*;

@Entity
@Table(name="MGR_Table1")
public class Manager extends Employee
{
	private static final long serialVersionUID=1L;
	private String deptName;
	
	public String getDeptName() 
	{
		return deptName;
	}
	public void setDeptName(String deptName) 
	{
		this.deptName = deptName;
	}
}