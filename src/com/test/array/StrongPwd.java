package com.test.array;

import java.util.HashMap;

public class StrongPwd {
	
	public static void main(String[] args) {
		int n = 6;
		String password = "#HackerRank";
		int length = minimumNumber(n, password);
		System.out.println(length);
	}
	
	public static int minimumNumber(int n, String password) {
		String special_char = "\"!@#$%^&*()-+\"";
		HashMap<Integer, Character> map = new HashMap();
		for(int i = 0; i < special_char.length(); i++) {
			map.put(i, special_char.charAt(i));
		}
        int count = 0;
        if(password.length() < 6){
            return password.length();
        }else {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    count++;
                } else if(Character.isLetter(password.charAt(i))){
                    count++;
                } else if(map.containsValue(password.charAt(i))){
                    count++;
                }
            }
            return password.length() - count;
        }
    }

}
