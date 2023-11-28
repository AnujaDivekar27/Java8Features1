package com.demo1;

/*traditional way of using Predicate Interface
*********************************************************************/

import java.util.function.Predicate;

public class PredicateInterface implements Predicate<Integer> {

	@Override
	public boolean test(Integer a) {
		if(a%2==0)
		{		
		 return true;
	    }

		else 
		{		
			 return false;
	    }
    }

    public static void main(String[] args) {
		
    	Predicate<Integer> p=new PredicateInterface();
		p.test(25);
		
		System.out.println("Number"+" " +" "+"is even???"+" "+p.test(25));
		
	}
}




