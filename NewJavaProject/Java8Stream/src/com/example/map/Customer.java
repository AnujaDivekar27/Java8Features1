package com.example.map;

import java.util.List;

public class Customer {

	private int id;
	private String name;
	private List<String> phoneno;

	public Customer(int id, String name, List<String> phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
	}

	
	public List<String> getPhoneno() {
		return phoneno;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
	}

	
}
