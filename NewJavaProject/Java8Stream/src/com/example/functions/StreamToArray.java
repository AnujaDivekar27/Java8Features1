package com.example.functions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamToArray {
 
 public static void main(String[] args) {
	
  //convert array of String into list<String> 	 
  List<String> list=Arrays.asList("a","b","1","2");
  
  //convert array->stream->array of object
  Object arr[]=list.stream().toArray(); //returns array containing elements of stream
  for(Object v:arr)
  {
	  System.out.println(v);
  }
 
  System.out.println("==================================================================");
  Object arr1[]=list.stream().toArray();
 
  System.out.println(arr1);  //[Ljava.lang.Object;@3e3abc88
  
  System.out.println(arr1.toString());//[Ljava.lang.Object;@3e3abc88
  
  System.out.println(Arrays.toString(arr1));  //[a, b, 1, 2]
  
  System.out.println(Objects.toString(arr1)); //[Ljava.lang.Object;@3e3abc88
 }
}
