// Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

// Solve it without division and in O(n).

// For example, given [1,2,3,4], return [24,12,8,6].

//tutorial:http://fisherlei.blogspot.com/2015/10/leetcode-product-of-array-except-self.html
public class Solution {
    public int[] productExceptSelf(int[] nums) {
    	if (nums.length <= 1) {
    		return null;
    	}
        int arr[] = new int [nums.length];
        arr[0] = 1;
        for (int i = 1;i< nums.length ; i++) {
        	arr[i] = arr[i-1] *nums[i-1];
        	// System.out.print(arr[i]+ " ");
        }
        int product = 1;
        for (int i = nums.length - 2; i >= 0;i-- ) {
        	product = product * nums[i+1];
        	arr[i] *= product;
        	// System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}