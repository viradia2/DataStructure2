package com.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {4,3,2,7,8,2,3,1};
		DuplicatesInAnArray d = new DuplicatesInAnArray();
		List<Integer> list = d.findDuplicates(array);
		
		//Printing the Duplicates Values
		System.out.println(list);
	}

	private List<Integer> findDuplicates(int[] array) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		//Sort the Array, So we can get all the duplicates
		//values together
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++){
			//Compare each element with it's next element
			if(i < array.length - 1){
				//if equals then add it to the list
				if(array[i] == array[i+1]){
					list.add(array[i]);
				}
			}
		}
		
		//Return the list with the duplicate elements.
		return list;
	}

}
