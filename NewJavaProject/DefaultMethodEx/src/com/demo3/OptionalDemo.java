package com.demo3;

/* ------------------Optional Class->java.util package--------------
 * introduce in jdk1.8,final class having private constructor
 * used to handle NullPointerException
 *******************************************************************/

public class OptionalDemo {

	public static void main(String[] args) {
		
		String[] str=new String[5];
		for(String s:str) {
			System.out.println(s);  //null,null,null,null,null
		    System.out.println(s.toUpperCase());
		    /*null
		    
		    Exception in thread "main" java.lang.NullPointerException
			at com.demo3.OptionalDemo.main(OptionalDemo.java:10)
            when we try to perform operation on null values
            */
        }
    }
}	

