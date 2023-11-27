package com.demo1;
/*
 * ------------Consumer Interface-> java.util.function-----------
 * Consumer is functional interface -> void accept(t);
 * only single abstract method accepting single i/p(object) 
 * and returns nothing
 ***************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		/*-----------------------------------------
		/*iterate list1 using foreach loop
		
		for(String s:list1)
		 System.out.println(s);
		
		------------------------------------------*/

		 list1.forEach(s-> System.out.println(s));
			
		 System.out.println("Print String using consumer interface");
		 
		 Consumer<String> str=(s1)-> System.out.println(s1);
		 str.accept("Hello");
		 
		}
	}

