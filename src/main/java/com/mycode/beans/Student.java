package com.mycode.beans;

public class Student {
	private int rollNum;
	private String name;
	private Address address;

	public Student() {
		super();
	}

	public Student(int rollNum, String name, Address address) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.address = address;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
