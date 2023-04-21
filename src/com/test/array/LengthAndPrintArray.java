package com.test.array;

public class LengthAndPrintArray {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60};
		String str[] = {"yesh", "rakesh", "pawan", "amit", "guddu"};
		int arrLength = arr.length;
		int strLength = str.length;
		System.out.println("Integer Array Length :: " +arrLength);
		System.out.println("String Array Length :: " +strLength);
		// First way to print
		for(int i = 0; i < arrLength; i++) {
			System.out.print (arr[i] + "   ");
		}
		for(int i = 0; i < strLength; i++) {
			System.out.print (str[i] + "   ");
		}
		// Second way to print
		System.out.println("\n----------------------------------------------");
		for(int element : arr) {
			System.out.println(element + "  ");
		}
		for(String element : str) {
			System.out.println(element + "  ");
		}
	}
}
