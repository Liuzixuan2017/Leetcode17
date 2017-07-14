// Given an array of integers, find if the array contains any duplicates. 
// Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

// public class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length - 1; i++) {
//             if (nums[i] == nums[i+1]) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
import java.util.*;
public class Solution {
    public boolean containsDuplicate(int[] nums) {
    	// if (nums.length == 0) {
    	// 	return false;
    	// }
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        for (int i = 0;i< nums.length ; i++) {
        	Integer getCount = table.get(nums[i]);
        	if (getCount == null) {
        		table.put(nums[i], 1);
        	} else {
        		return true;
        	}
        }
        return false;
    }
}