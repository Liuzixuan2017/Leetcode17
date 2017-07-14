// Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

// You may assume that the array is non-empty and the majority element always exist in the array.
import java.util.*;
import java.util.Hashtable; 
public class Solution {
    public int majorityElement(int[] nums) {
       Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
       Integer count = 0;
        for (int i = 0; i< nums.length ;i++ ) {
        	count = table.get(nums[i]);//int cannot be null, only reference type can be null not primitive type
        	if (count == null) {
        		table.put(nums[i], 1);
        	} else {
        		table.put(nums[i], count + 1);
        	}
        }

        Enumeration<Integer> ele = table.keys();
        while(ele.hasMoreElements()) {
        	Integer element = ele.nextElement();
        	count = table.get(element);
        	if (count > Math.floor(nums.length / 2)) {
        		return element;
        	}
        }
        return -1;
    }
}