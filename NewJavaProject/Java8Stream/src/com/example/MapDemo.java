package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo {

  public static void main(String[] args) {
	
   List<String> vechiles=Arrays.asList("car","train","bus");
   List<String> upperCase=new  ArrayList<String>();
   for(String n:vechiles)
   {
     upperCase.add(n.toUpperCase());
   }
   System.out.println(upperCase);
   
   System.out.println("convert stream from lowercase to uppercase using stream");
   System.out.println("=======================================================");
   
   vechiles.stream().map(n->n.toUpperCase()).forEach(System.out::println);
   
  }
}