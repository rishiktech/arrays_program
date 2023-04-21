package com.test.array;

import java.util.Scanner;

public class InputFromConsole {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr = new int[number];
		for(int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Integer number is ::::: " +arr[i]);
		}
	}

}
