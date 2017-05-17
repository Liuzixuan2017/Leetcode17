// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// For example, given nums  = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

// Note:

// You must do this in-place without making a copy of the array.
// Minimize the total number of operations.


public class Solution {
    public void moveZeroes(int[] nums) {
        int count  = 0;
        int store[] = new int [nums.length];
        for (int i = 0;i< nums.length ;i++ ) {
        	if (nums[i] != 0) {
        		store[count++] = nums[i];
        	}
        }
        for (int i = count; i< nums.length ;i++ ) {
        	store[i] = 0;
        }
        for (int i = 0;i< nums.length ;i++ ) {
        	nums[i] = store[i];
        }
    }
}
// public class Solution {
//     public void moveZeroes(int[] nums) {
//     	int indexof0 = 0;
//     	//always swap with the index of 0 with the index of no -0 after it
//     	while(indexof0 < nums.length && nums[indexof0] != 0) {
//     			indexof0++;
//     	}
//     	int indexofNon0 = indexof0;
//     	while(indexofNon0 < nums.length && nums[indexofNon0] == 0) {
//     			indexofNon0++;
//     	}
//     	while (indexof0 < nums.length && indexofNon0 < nums.length) {
//     		if (indexof0 < nums.length && indexofNon0 < nums.length) {
//     			int temp =  nums[indexof0];
//     			nums[indexof0] = nums[indexofNon0];
//     			nums[indexofNon0] = temp;
//     		}
//     		while(indexof0 < nums.length && nums[indexof0] != 0) {
//     			indexof0++;
//     		}
//     		while(indexofNon0 < nums.length && nums[indexofNon0] == 0) {
//     			indexofNon0++;
//     		}
//     	}
//     }
// }online solution
