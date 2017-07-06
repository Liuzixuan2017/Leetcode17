/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/

public class Solution {
    public int rob(int[] nums) {
        // sort the array and always pick the highest number but need to check the connectivity first
        //dynamic programming

    	if (nums.length == 0) {
    		return 0;
    	}
    	if (nums.length == 1) {
    		return nums[0];
    	}
        //extra data structure
        int arr[] = new int [nums.length];

        //base case
        arr[0] = nums[0];
        if (nums[1] > arr[0]) {
        	arr[1] = nums[1];
        } else {
        	arr[1] = arr[0];
        }

        for (int i = 2; i < nums.length; i++ ) {
        	int comp = nums[i] + arr[i-2];
        	if (comp > arr[i-1]) {
        		arr[i] = comp;
        	} else {
        		arr[i] = arr[i-1];
        	}
        }
        return arr[arr.length - 1];
    }
}