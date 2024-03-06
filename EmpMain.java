package com.javademo;


//Abstraction in java 

public class EmpMain {
class Employee
{
	private int id;
	private String name;
	private String design;
	private String sal;
	private String dob;
	private String Password;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", design=" + design + ", sal=" + sal + ", dob=" + dob
				+ ", Password=" + Password + "]";
	}
	
	
	
}
	public static void main(String[] args) {
	Employee emp=new Employee();
	System.out.println(emp);
	}

}
