package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListWithStream {

  public static void main(String[] args) {
	
   List<Integer> l1=Arrays.asList(23,12,44,65,78);
   List<Integer>l2=l1.stream().filter(n->n%2==0).collect(Collectors.toList());
   System.out.println(l2);
}
}
