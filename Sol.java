package com.leetcode2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol {
	
	protected void isTrue(){
		
	}
	public static void main(String[] args) {
		int x = 10*20-20;
		System.out.println(x);
		
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<10;i++){
			list.add(i);
		}
		
		Collections.sort(list);
		
		
		String str1 = new String("www.vivek.com");
		String str23 = new String("www.vivek.com");
		System.out.println(str1 == str23);
		
		String str2 = (String) str1.subSequence(4, 8);
		
		boolean b = str1.equals(str2);
		System.out.println(str2);
		
		Sol so = new Sol();
		so.printColorUsingSwitch("blue");
				
	}
	
	private void printColorUsingSwitch(String color) {
		switch (color) {
		case "blue":
			System.out.println("BLUE");
			break;
		case "red":
			System.out.println("RED");
			break;
		default:
			System.out.println("INVALID COLOR CODE");
		}
	}
}
