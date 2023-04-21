package com.test.array;

public class ThirdLargestNumber {
	
	public static void main(String[] args) {
		int arr[] = { 70, 80, 30, 50, 20, 10, 40 };
		System.out.println("---------------------------------------------------------------");
		int largest = arr[0];
		int secondLargest = arr[1];
		int thirdLargest = arr[2];
		for(int a = 0; a <arr.length; a++) {
			if(arr[a] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[a];
			} else if(arr[a] > secondLargest && arr[a] != largest) {
				thirdLargest = secondLargest;
				secondLargest = arr[a];
			} else if(arr[a] > thirdLargest && arr[a] != largest && arr[a] != secondLargest) {
				thirdLargest = arr[a];
			}
		}
		System.out.println("third way ::: "+thirdLargest);
	}

}
