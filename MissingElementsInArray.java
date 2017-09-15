package com.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,1};
		MissingElementsInArray m = new MissingElementsInArray();
		m.findMissingElementsInArray(array);
	}

	private void findMissingElementsInArray(int[] array) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		//Sort the array
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++){
			if(i < array.length -1){
				//Checking the difference between two consecutive elements
				if(Math.abs(array[i] - array[i+1]) != 1 && array[i] != array[i+1]){
					//if the difference is big we have to add all the numbers lies between the gap
					if(Math.abs(array[i] - array[i+1]) > 1){
						for(int j=1; j<Math.abs(array[i] - array[i+1]); j++){
							list.add(array[i] + j);
						}
					}else{
						//Only one number if gap is 1
						list.add(array[i] + 1);
					}
				}
			}
		}
		System.out.println(list);
	}

}
