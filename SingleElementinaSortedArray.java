package com.leetcode2;

public class SingleElementinaSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,1,2};
		SingleElementinaSortedArray s = new SingleElementinaSortedArray();
		s.findSingleElementfromSortedArray(array);
	}

	private void findSingleElementfromSortedArray(int[] array) {
		// TODO Auto-generated method stub
		int missingElement = 0;
		int count = 0;
		int i=0;
		
		//Looping through array
		while(count < array.length){
			//Check if two consecutive elements are same
			//then increment count and i by 2
			if(count < array.length - 1){
				if(array[i] == array[i + 1]){
					count = count + 2;
					i = i + 2;
				}else{
					//Else save the element into variable
					missingElement = array[i];
					count++;
					i++;
				}
			}else{
				missingElement = array[i];
				break;
			}
		}
		
		//Printing the element
		System.out.println("Missing Element: " + missingElement);
	}

}
