package com.test.array;

public class SecondLargestExample1 {

	public static void main(String[] args) {
		int arr[] = { 70, 80, 30, 50, 20, 10, 40 };
		System.out.println("---------------------------------------------------------------");
		int largest = arr[0];
		int secondLargest = arr[1];
		for(int a = 0; a <arr.length; a++) {
			if(arr[a] > largest) {
				secondLargest = largest;
				largest = arr[a];
			} else if(arr[a] > secondLargest && arr[a] != largest) {
				secondLargest =arr[a];
			}
		}
		System.out.println("second way ::: "+secondLargest);
	}

}
