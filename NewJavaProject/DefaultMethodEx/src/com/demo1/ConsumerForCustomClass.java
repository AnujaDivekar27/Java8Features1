package com.demo1;

import java.util.function.Consumer;

public class ConsumerForCustomClass {
 
  public static void main(String[] args) {
	
    Student s1=new Student();
    s1.setSid(1); s1.setSname("Devansh");
	  
    Consumer<Student> stud=t->System.out.println(t);	  
    stud.accept(s1);
  }
	//here accept method taking single student object 
}
