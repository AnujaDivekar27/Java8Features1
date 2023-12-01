package com.example.map;

import java.util.List;
import java.util.stream.Collectors;

public class CustomWithMap {
 
  public static void main(String[] args) {
 
  List<Customer> clist=CustomerDemo.getAll();
  
  //convert List<Customer> into List<String> containing Customer name
  //nd return List<Customer>
  
  List<String> cname=clist.stream().map(n->n.getName()).collect(Collectors.toList());
  System.out.println(cname);   //[komal gavali, anuja more, kajal duraphe]
 
  System.out.println("==========================================================================");
  
  List<List<String>> contactno=clist.stream().map(n->n.getPhoneno()).collect(Collectors.toList());
  System.out.println(contactno); //returns List<List<String>>
  //[[9689427279, 9156516403], [7709310164, 02425224276], [9607736344, 9852514500]] 
 
  System.out.println("==========================================================================================================");
  List<String> contactno1=clist.stream().flatMap(n->n.getPhoneno().stream()).collect(Collectors.toList());
  System.out.println(contactno1);
  }
}
