package com.demo1;

import java.util.function.Supplier;

/*-----------Supplier Interface->java.util.function-----------------
 * no input only supply,
 * contains single abstract method: get<t> which returns object
 ********************************************************************/

public class SupplierInterfaceEx {

	public static void main(String[] args) {

		Supplier<String> str = () -> {

			String s = "Hello";
			return s;

		};

		System.out.println(str.get());
		System.out.println("------------------------------------------");

		Supplier<Student> stud = () -> {

			Student s = new Student();
			s.setSid(1);
			s.setSname("Devansh");
			return s;

		};

		System.out.println(stud.get());
		System.out.println("------------------------------------------");
		
	}

}
