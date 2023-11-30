package com.example;

import java.util.stream.Stream;

public class StreamDemo {

  public static void main(String... args) {
	
    Stream<Integer> strint= Stream.of(1,5,2,4,8,7,5); //not array
    //strint.forEach(n->System.out.println(n)); //internally used Consumer
    
    System.out.println("================================================");
    //forEach returns void
    //Stream.of(1,5,2,4,8,7,5).forEach(n1->System.out.println(n1));
  
    System.out.println("================================================");
    //forEach returns void,using method references
    Stream.of(1,5,2,4,8,7,5).forEach(System.out::println);
  
    System.out.println("=========Count()====================================");
    //count():terminal operation
    long n=Stream.of(new String[] {"abc","pqr","xyz"}).count();
    System.out.println("Total elements in stream:"+" "+n);  
  
    System.out.println("================================================");
    Stream<String>str=Stream.of(new String[] {"abc","pqr","xyz"});
    str.forEach(n1->System.out.println(n1));
  }
}