// Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
import java.util.*;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if (nums.length == 0 || k == 0) {
    		return false;
    	}
		Hashtable<Integer, Integer> table  = new atHashtable<Integer, Integer>();
		for (int i = 0; i < nums.length; i++ ) {
			Integer index = table.get(nums[i]);
			if (index == null) {
				table.put(nums[i], i);
			} else {
				if (i - index <= k) {
					return true;
				} else {
					table.put(nums[i], i);
				}
			}
		}
		return false;        
    }
}//slow solution

//faster alternative solutions
// public class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//         if(nums.length ==0 || k == 0) return false;
//         for(int i = 0, j = 1; j < nums.length; j++) {
//             if(nums[i] == nums[j] && j - i <= k) return true;
//             if(j - i > k || j == nums.length - 1){
//                 while(j - 1> i) {
//                     i++;
//                     if(nums[i] == nums[j]) return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


// public class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         if(nums == null || nums.length < 2) return false;
//         Set<Integer> set = new HashSet<>();
//         for(int i = 0; i < nums.length; i++){
//             if(i > k){
//                 set.remove(nums[i - k - 1]);
//             }
//             if(!set.add(nums[i])) return true;
//         }
//         return false;
//     }
// }