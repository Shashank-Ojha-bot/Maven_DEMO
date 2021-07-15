package com.learn.mavendemo;

public class Department {
	private int departmentId;
	private String departmentName;
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(int departmentId, String departmentName) {
		super();
		System.out.println("Parameterized Constructor-Department");
		
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
	public void init()
	{
		System.out.println("It is init method-Department");
	}
	
	public void destroy()
	{
		System.out.println("It is destroy method-Departement");
	}
	
	

}
