package com.example.functions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFunction {
 
 public static void main(String[] args) {
 
   List<Integer> l1=Arrays.asList(5,3,10,2,8);
   System.out.println("sort list in ascending order using sorted() function");
   //sorted():intermediate function sort stream in ascending order
   System.out.println("===================================================================================");
   
   //l1.stream().sorted().forEach(System.out::println);
   List<Integer> sortedl1=l1.stream().sorted().collect(Collectors.toList());
   System.out.println(sortedl1);  //[2, 3, 5, 8, 10]
 
   System.out.println("===================================================================================");
   
   List<Integer> sortedlreversel1=l1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
   //reverse sorted stream
   System.out.println("sort list in reverse order using sorted((Comparator.reverseOrder())");
   System.out.println( sortedlreversel1); //[10, 8, 5, 3, 2]
 
   System.out.println("===================================================================================");
 
 
 
 }

}
