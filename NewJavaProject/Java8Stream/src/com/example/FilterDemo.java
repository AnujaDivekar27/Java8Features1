package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
  
  public static void main(String[] args) {
  
   List<Integer> l1=Arrays.asList(30,51,23,45,89,66);
   System.out.println("==============================================");
   for(Integer i:l1)
   {
	 if(i%2==0)
	 {
	   System.out.println(i);	 
	 }
   }
   
   System.out.println("List with Stream nd Filter()");
   System.out.println("==============================================");
   l1.stream().filter(n->n%2==0).forEach(System.out::println);
  
   //filter():intermediate operation returns stream,internally uses predicate
   //forEach:terminal operation returns void,internally uses consumer
  
   System.out.println("==============================================");
   l1.stream().filter(n->n%2==0).collect(Collectors.toList());
   System.out.println(l1);
   
   //collect():terminal operation
   //Collectors:final class,Collectors.toList():returns stream as list 
   
   System.out.println("store custom class objects in collections");
   System.out.println("==============================================");
  
   List<Product> plist=new ArrayList<Product>();
   plist.add(new Product(1,"Hp Laptop",65000));
   plist.add(new Product(2,"Dell Laptop",80000));
   plist.add(new Product(3,"Lenovo Laptop",70000));
   plist.add(new Product(4,"Sony Laptop",75000));
   
   plist.stream().filter(p->p.price>70000).forEach(System.out::println);
   

   


  
  }
}
