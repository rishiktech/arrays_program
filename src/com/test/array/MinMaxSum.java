package com.test.array;

import java.util.Arrays;
import java.util.List;

public class MinMaxSum {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		miniMaxSum(list);
	}
	
	public static void miniMaxSum(List<Integer> arr) {
        int length = arr.size();
        int sum = 0;
        Integer arrresult[] = new Integer[length];
        for(int i = 0; i <length; i++){
            for(int j = 0; j < length; j++){
                sum += arr.get(j);
            }
            arrresult[i]  = sum - arr.get(i);
            sum = 0;
        }
        
        System.out.println(Arrays.toString(arrresult));
        List<Integer> list = Arrays.asList(arrresult);
        Integer max = list.stream().max(Integer::compare).get();
        Integer min = list.stream().min(Integer::compare).get();
        System.out.println("Maximum value :: " +max);
        System.out.println("Minimum value :: " +min);

    }

}
