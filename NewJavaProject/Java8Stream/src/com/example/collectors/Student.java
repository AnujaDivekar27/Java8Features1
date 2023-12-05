package com.example.collectors;

public class Student {

	private int id;

	private String name;

	private String subject;

	private double percentage;

	public Student(int id, String name,String subject, double percentage) {

		this.id=id;
		this.name = name;
		this.subject = subject;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	
	public String getSubject() {
		return subject;
	}

	
	public double getPercentage() {
		return percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + ", percentage=" + percentage + "]";
	}

	
}
