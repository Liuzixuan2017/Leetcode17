// Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

// For example,
// Given nums = [0, 1, 3] return 2.

// Note:
// Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

public class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> test1 = new ArrayList<Integer>();
        for (int i  =0; i < nums.length; i++ ) {
        	test1.add(nums[i]);
        }
        ArrayList<Integer> test2 = new ArrayList<Integer>();
        for (int i = 0;i<nums.length+1 ; i++) {
        	test2.add(i);
        }
        test2.removeAll(test1);
        int f = test2.get(0);
        return f;
    }
}