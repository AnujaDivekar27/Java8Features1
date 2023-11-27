package com.demo1;

//-------Tranditional way to used Consumer interface----------------

import java.util.function.Consumer;

public class ConsumerDemo  implements Consumer<String>{

	@Override
	public void accept(String str) 
	{
	  System.out.println(str);	
	}

	public static void main(String[] args) {
		
	  Consumer<String> p=new ConsumerDemo();
	  p.accept("Welcome");
	  
	}
}
