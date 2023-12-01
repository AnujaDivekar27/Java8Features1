package com.example.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
 
  public static void main(String[] args) {
	
   List<Integer> number=Arrays.asList(1,2,3,4,5,6);
   System.out.println("===========================================================");
   System.out.println("List<Integer> with map()");
   List<Integer> number1=number.stream().map(n->n+10).collect(Collectors.toList());
   System.out.println(number1); 

   System.out.println("===========================================================");
   List<Integer> l1=Arrays.asList(1,2);
   List<Integer> l2=Arrays.asList(3,4);
   List<Integer> l3=Arrays.asList(5,6);
   
   System.out.println("===========================================================");
   System.out.println("convert List<List<Integer> into stream using flatMap");
   List<List<Integer>>list=Arrays.asList(l1,l2,l3);
   System.out.println(list); //[[1, 2], [3, 4], [5, 6]]
   
   List<Integer> finallist=list.stream().flatMap(n->n.stream()).collect(Collectors.toList());
   System.out.println(finallist); //[1, 2, 3, 4, 5, 6]
  
   System.out.println("===========================================================");
   System.out.println("list->stream->flatMap->stream->map->collect");
   List<Integer> finallist1=list.stream().flatMap(n->n.stream().map(n1->n1+10)).collect(Collectors.toList());
   System.out.println(finallist1); //[11, 12, 13, 14, 15, 16]
  
  
  
  }	
	
}
