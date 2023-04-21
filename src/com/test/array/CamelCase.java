package com.test.array;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {
	
	public static void main(String[] args) {
		String str = "saveChangesInTheEditor";
		int count = camelcase(str);
		System.out.println("total count :: "+count);
	}
	
	public static int camelcase(String s) {
	    StringBuffer sb = new StringBuffer();
	    List<StringBuffer> list = new ArrayList<>();
	    for(int i = 0; i < s.length(); i++){
	        char ch = s.charAt(i);
	        if(!String.valueOf(ch).equals(String.valueOf(ch).toUpperCase())){
	            sb.append(ch);
	        } else if(String.valueOf(ch).equals(String.valueOf(ch).toUpperCase())) { 
	        	list.add(sb);
	        	sb = new StringBuffer();
	        	sb.append(ch);
	        }
	    }
	    list.add(sb);
	    return list.size();
	    }

}
