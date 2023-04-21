package com.test.array;

public class RecursiveReverseArray {
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		reverse(arr);
	}
	
	public static int[] reverse(int[] arr) {
	   reverseArr(arr, 0, arr.length - 1);
	   return arr;
	}
	// recursive method
	public static void reverseArr(int[] x, int i, int j) {

	   // swap
	   if (i < j) {
	     int tmp = x[i];
	     x[i] = x[j];
	     x[j] = tmp;

	     // recursive call
	     reverseArr(x, ++i, --j);
	   }
	}
}
