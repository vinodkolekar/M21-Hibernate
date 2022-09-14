package com.cg.joinedtableinheritance;
import javax.persistence.*;

@Entity
@Table(name="Mgr_Table2")
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
