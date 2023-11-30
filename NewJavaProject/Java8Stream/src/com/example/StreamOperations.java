package com.example;

import java.util.Arrays;

public class StreamOperations {

  public static void main(String[] args) {
	
<<<<<<< HEAD
	int a[]= {5,7,4,9,1,7};
	System.out.println("max():find maximum element from an array");
	//max()->terminal operation returns operational
	int max=Arrays.stream(a).max().getAsInt(); 
=======
    int a[]= {5,7,4,9,1};
    System.out.println("find maximum element from an array");
    //max()->terminal operation returns operational
    int max=Arrays.stream(a).max().getAsInt(); 
>>>>>>> 876d2a268ad0e8667afc3e373cff04c437f350ae
    System.out.println(max);
    
    System.out.println("=============================================");
    System.out.println("min():find minimum element from an array");
    //min()->terminal operation returns operational
    int min=Arrays.stream(a).min().getAsInt();  
    System.out.println(min);
    
    System.out.println("=============================================");
    System.out.println("count():find total element from an array");
    //count()->terminal operation returns operational
    long count=Arrays.stream(a).count();  
    System.out.println(count);
    
    System.out.println("=============================================");
    System.out.println("sorted():sort an array in ascending order");
    //sorted()->intermediate operation 
    Arrays.stream(a).sorted().forEach(n->System.out.println(n));  
    
    System.out.println("=============================================");
    System.out.println("distinct():distinct element from an array");
    //sorted()->intermediate operation returns operational
    Arrays.stream(a).distinct().forEach(n->System.out.println(n));;  
   
    System.out.println("=============================================");
    String[] str= {"abc","pqr","adbg"};
    System.out.println("find string which start with a");
    Arrays.stream(str).filter(n->n.startsWith("a")).forEach(System.out::println);
    
    
  }
}
