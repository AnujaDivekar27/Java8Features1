package com.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateForEven {
  
  public static void main(String[] args) {
	
      //pass array as list
	  List<Integer> list=Arrays.asList(3,17,34,65,48);
    
      Predicate<Integer> p= a->a%2==0;
      int evencnt=0;
      for(Integer i:list)
      {
    	if(p.test(i))
    	{
    	  evencnt++;
    	  System.out.println(i);
    	}
      }
      System.out.println("Total even numbers in list:"+evencnt);
  }
}
