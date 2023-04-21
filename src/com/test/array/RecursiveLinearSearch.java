package com.test.array;

import java.util.Scanner;

public class RecursiveLinearSearch {
	
	public static void main(String[] args) {
	      // Scanner class object to read input
	      Scanner scan = new Scanner(System.in);
	      // array
	      int arr[] = { 50, 90, 30, 70, 60 };
	      // read search key
	      int key = 0;
	      System.out.print("Enter search key: ");
	      key = scan.nextInt();
	      // linear search
	      int index = linear(arr, 0, key);
	      // display result
	      if (index == -1)
	         System.out.println(key + " not Found.");
	      else
	         System.out.println(key + " Found at Index = " + index);

	      // close Scanner class object
	      scan.close();
	   }

	   public static int linear(int arr[], int index, int key) {
	      if (index >= arr.length)
	         return -1;
	      else if (arr[index] == key)
	         return index;
	      else
	         return linear(arr, index + 1, key);
	   }

}
