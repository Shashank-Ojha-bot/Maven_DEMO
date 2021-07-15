package com.learn.mavendemo.model;

public class Student {
	private int studentId;
	private String studentName;
	private int mark;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, int mark) {
		super();
		System.out.println("Parameterized Constructor-Student");
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.mark = mark;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting student Id");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting student name");
		this.studentName = studentName;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		System.out.println("Setting student marks");
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", mark=" + mark + "]";
	}
	
	public void init()
	{
		System.out.println("It is init method-Student");
	}
	
	public void destroy()
	{
		System.out.println("It is destroy method-Student");
	}
	

}
