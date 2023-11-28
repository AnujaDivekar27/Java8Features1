package com.demo4;

public class Student {

	private String sname;
	private String address;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", address=" + address + "]";
	}
	

}
