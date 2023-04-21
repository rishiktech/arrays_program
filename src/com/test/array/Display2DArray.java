package com.test.array;

public class Display2DArray {

	public static void main(String[] args) {
		// declare and initialize an array
		int arr[][] = { { 50, 60 }, { 70, 80 }, { 90, 100 } };
		for (int number[] : arr) {
			for (int element : number) {
				System.out.print(element + "  ");
			}
		}
		System.out.println("\n-------------------------------------------");
		// display 2D array using for loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}

}
