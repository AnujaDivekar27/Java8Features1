package com.demo1;

import java.util.function.Predicate;

/*-----------Predicate Interface->java.util.function-----------------
 * single input returns boolean value based on condition,
 * contains single abstract method: public boolean test<t> which 
 * returns boolean value true/false
 ********************************************************************/

public class PredicateInterfaceEx {

   public static void main(String[] args) {
	
	Predicate<String> p=str->str.equals("abc");
	
	System.out.println(p.test("hello"));
	
	System.out.println("--------------------------------------------");
	System.out.println("check number is geater than 10 or not");
   
	Predicate<Integer> p1=i->i>10;
	System.out.println("number is greater than 10???"+"->"+p1.test(34));
	
	
	
	

    
   }
}