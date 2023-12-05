package com.example;

public class StringDemo1 {

	public static void main(String[] args) {
		
	  String s1="hello"; //1object created in scp
	  String s2=new String("java"); //2object created 1->heap,1->scp
	  
	  System.out.println(s1.hashCode()); //99162322
	  System.out.println(s2.hashCode()); //3254818
	  
	  
	}
}
