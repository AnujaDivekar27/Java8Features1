package com.demo3;

import java.util.Optional;

public class OptinalDemo1 {

  public static void main(String[] args) {
		
	String[] str=new String[5];
	
	//Returns an Optional with the specified present non-null value.
	//returns empty optional if value not present
	Optional<String> opt= Optional.ofNullable(str[4]); //static method
	
	System.out.println(opt); //Optional.empty
	
	//System.out.println(opt.get()); //java.util.NoSuchElementException
	                               //No value present
    
	if(opt.isPresent())// returns boolean value
    {
      System.out.println(str[4].toUpperCase());	
    }
  
    else
    {
      System.out.println("String is null");	//String is null
    }
  }
}
