package com.test.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfArrays {
	
	public static void main(String[] args) {
		int array[] = {10, 20, 30, 40, 50};
		int sum1 = 0;
		for(int i = 0; i < array.length; i++) {
			sum1 += array[i];
		}
		System.out.println(sum1 + "\n");
		
	    List<Integer> list = new ArrayList<Integer>();
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    list.add(50);
	    // initialize sum variable with 0
	    int sum = 0;
	    // add array elements to sum
	    for (int i : list) {
	      sum += i;
	    }
	    // display the result
	    System.out.println("Sum = " + sum);
	    System.out.println("------------------------------------------------");
	    int result = (int) list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
	    System.out.println("STream api ::::::" +result);
	}

}
