package com.leetcode2;

public class ContainsNBDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2, 2};
		containsDuplicates(array, 3, 0);
	}

	private static boolean containsDuplicates(int[] nums, int k, int t) {
		// TODO Auto-generated method stub
		for(int a=0; a<nums.length; a++){
            for(int b=a+1; b<nums.length; b++){
            	if(b <= nums.length-1){
	                if(Math.abs(nums[a]- nums[b]) == t && Math.abs(a - b) == k){
	                	System.out.println("It's Working Bro");
	                	return true;
	                }
            	}
            }  
        }
		return false;
	}

}
