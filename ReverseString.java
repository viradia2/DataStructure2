package com.leetcode2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  a  b ";
		ReverseString r = new ReverseString();
		
		r.reverseStringbyWord(str);
	}

	private void reverseStringbyWord(String str) {
		// TODO Auto-generated method stub
		
		//Converting Sentence into Array by removing extra space before each words.
		//Regex(//s+) for removing more than one space between words
		String[] words = str.trim().split("\\s+");
		StringBuffer sb = new StringBuffer();
		
		//Appending words to StringBuffer from the end of the array
		for(int i=words.length - 1; i>=0; i--){
			sb.append(words[i] + " ");
		}
		
		//Printing out String by converting sb into String
		System.out.println(sb.toString().trim());
	}

}
 