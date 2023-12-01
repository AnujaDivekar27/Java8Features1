package com.example.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDemo {

  public static List<Customer> getAll()
  {
	return Stream.of
			
		   (new Customer(101,"komal gavali",Arrays.asList("9689427279","9156516403")),
		    new Customer(102,"anuja more",Arrays.asList("7709310164","02425224276")),
		    new Customer(101,"kajal duraphe",Arrays.asList("9607736344","9852514500"))
		    ).collect(Collectors.toList());
  }
}
