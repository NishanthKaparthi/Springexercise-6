package com.montrealcollege.exercise5.entities;

public class Student {
	private String firstName;
	private String lastName;
	private Program program;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Program getProgram() {
		return program;
	}

	
	public void setProgram(Program program) {
		this.program = program;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", program=" + program + "]";
	}

}
