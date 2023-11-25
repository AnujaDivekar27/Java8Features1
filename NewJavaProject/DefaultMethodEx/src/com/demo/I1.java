package com.demo;

public interface I1 {

	void m1();    //abstract by default
	default void m3()
	 {
		 System.out.println("default m3 method of I1");
	 }
}
