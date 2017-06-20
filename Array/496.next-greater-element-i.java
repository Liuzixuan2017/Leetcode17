import java.util.*;
// You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
// The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        // int arr[] = new int[findNums.length];
        // for (int i = 0;i < findNums.length; i++ ) {
        // 	int target = findNums[i];
        // 	arr[i] = -1;
        // 	boolean seen = false;
        // 	for (int j = 0; j < nums.length; j++ ) {
        // 		if (nums[j] == target) {
        // 			seen = true;
        // 		}
        // 		if (seen == true && nums[j] > target) {
        // 			arr[i] = nums[j];
        // 			break;
        // 		}	
        // 	}
        // }
        // return arr;//brute force 
        Stack<Integer> s = new Stack<Integer>();
        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
        for (int i = 0;i < nums.length; i++) {
        	while (s.empty() == false && nums[i] > s.peek()) {
        		ht.put(s.pop(), nums[i]);
        	}
        	s.push(nums[i]);
        }
        int arr[] = new int[findNums.length];
        for (int i = 0; i < findNums.length ; i++) {
        	Integer g = ht.get(findNums[i]);
        	if (g == null) {
        		arr[i] = -1;
        	} else {
        		arr[i] = g;
        	}
        }
        return arr;
    }
}