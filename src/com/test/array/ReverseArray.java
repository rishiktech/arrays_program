package com.test.array;

public class ReverseArray {
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40}; 
		int length = arr.length;
		for(int i = length -1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
		String str[] = {"rishi", "yesh", "aman",  "baby", "kamal"}; 
		int size = str.length;
		for(int i = size -1; i >= 0; i--) {
			System.out.println(str[i]);
		}
	}

}
