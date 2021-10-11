package com.mycode.beans;

public class Address {
	private int doorNum;
	private String city;

	public Address() {
		super();
	}

	public Address(int doorNum, String city) {
		super();
		this.doorNum = doorNum;
		this.city = city;
	}

	public int getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
