package com.test.array;

import java.util.Arrays;

public class MergeTwoArray {
	
	public static void main(String[] args) {
		// array which should be merged
	      int src1[] = {10, 20, 30, 40, 50};
	      int src2[] = {9, 18, 27, 36, 45};
	      int arr[] = new int[src1.length+src2.length];
	      for(int i = 0; i < src1.length; i++) {
	    	arr[i] = src1[i];  
	      }
	      for(int i=0, j=src1.length; j<(src1.length + src2.length); 
	                                                      j++, i++) {
	         arr[j] = src2[i];
	      }
	      
	      System.out.println("Arrays are ::: " +Arrays.toString(arr));
	}

}
