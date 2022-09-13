package com.cg.entities;
import java.io.*;
import javax.persistence.*;

@Entity
@Table(name="employee")

// Employee is an entity
public class Employee implements Serializable 
{
	private static final long SerialVersionUID=1L;
	@Id
	private int ID;
	private String NAME;
	
	public int getID() 
	{
		return ID;
	}
	public void setID(int iD) 
	{
		ID = iD;
	}
	public String getNAME() 
	{
		return NAME;
	}
	public void setNAME(String nAME) 
	{
		NAME = nAME;
	}	
}
