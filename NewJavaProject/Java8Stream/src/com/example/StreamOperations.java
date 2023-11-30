package com.example;

import java.util.Arrays;

public class StreamOperations {

  public static void main(String[] args) {
	
	int a[]= {5,7,4,9,1};
	System.out.println("find maximum element from an array");
	//max()->terminal operation returns operational
	int max=Arrays.stream(a).max().getAsInt(); 
    System.out.println(max);
    
    System.out.println("=============================================");
    System.out.println("find minimum element from an array");
    //min()->terminal operation returns operational
    int min=Arrays.stream(a).min().getAsInt();  
    System.out.println(min);
    
    System.out.println("=============================================");
    System.out.println("find total element from an array");
    //count()->terminal operation returns operational
    long count=Arrays.stream(a).count();  
    System.out.println(count);
    
  }
}
