// Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You may assume no duplicates in the array.

// Here are few examples.
// [1,3,5,6], 5 → 2
// [1,3,5,6], 2 → 1
// [1,3,5,6], 7 → 4
// [1,3,5,6], 0 → 0

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
        	return -1;
        }
        if (target <= nums[0]) {
        	return 0;
        }
        if (target > nums[nums.length -1]) {
        	return nums.length;
        }

        int low  = 0;
        int high = nums.length - 1;
        while(low <= high ) {
        	int m = (low + high)/2;
        	if (nums[m] == target) {
        		return m;
        	} else if (nums[m] < target) {
        		low++;
        	} else {
        		high--;
        	}
        }
        return low;//low is the position where you need supposed to insert this unseen element
    }
}