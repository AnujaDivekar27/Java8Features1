package com.example.functions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamFunctions {

 public static void main(String[] args) {
	
  List<String> l1=Arrays.asList("a","b","d","a","f","c","d");
  System.out.println("stream with distinct() operation"); 
  //intermediate operation,returns stream of distinct elements
  System.out.println("============================================================");
  //l1.stream().distinct().forEach(System.out::println);

  System.out.println("============================================================");
  List<String> l2=l1.stream().distinct().collect(Collectors.toList());
  System.out.println(l2);  //[a, b, d, f, c]

  System.out.println("stream with count() operation");
  //terminal operation,returns no of elements in stream as long variable
  System.out.println("============================================================");
  long cnt=l1.stream().count();
  System.out.println("no of elements in list l1:"+" "+cnt); 
  //no of elements in list l1: 7
  
  System.out.println("stream with limit() operation");
  //intermediate operation,returns stream limit on no of elements
  System.out.println("============================================================");
  //l1.stream().limit(5).forEach(System.out::println);
  List<String> l3=l1.stream().limit(5).collect(Collectors.toList());
  System.out.println("stream with first 5 elements from list l1:"+" "+l3);
  
  System.out.println("============================================================");

 }
}
