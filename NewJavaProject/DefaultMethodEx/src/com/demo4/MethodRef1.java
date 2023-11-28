package com.demo4;

public class MethodRef1 {
 
  public static void main(String[] args) {
	
	 //using lambda expression
    //gives reference of static method of class to interface abstract method
	
	Test t=()->SetStudent.setStud();
    t.show(); //Student [sname=Devansh, address=Baramati]
     
    //using lambda expression for instance method
    System.out.println("--------------------------------------------");
    Test test1=()->new SetStudent().setStudent();
    test1.show();
    
    //using method references for static method of class
    System.out.println("--------------------------------------------");
    
    Test t1=SetStudent::setStud;
    t1.show(); //Student [sname=Devansh, address=Baramati]
  
    System.out.println("--------------------------------------------");
    //using method references for instance method of class
    
    SetStudent stud=new SetStudent();
    Test t3=stud::setStudent;
    t1.show(); //Student [sname=Devansh, address=Baramati]
  
 
  }
}
