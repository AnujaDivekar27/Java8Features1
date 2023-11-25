//--------------Default Method In Interface------------------
package com.demo;

public class Class1 implements I1,I2
{

	@Override
	public void m1() {
		
	 System.out.println("Implements m1 method of I1");
		
	}

	public static void main(String[] args) {
		
		I1.clean(); //static method of I1
		
		I1 i1=new Class1();
		I1.clean();
		i1.m1();  //abstract method
		i1.m3();  //default method
		
		
		I2 i2=new Class1();
		i2.m2();  //default method
	}
}
