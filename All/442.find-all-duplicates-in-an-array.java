// Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

// Find all the elements that appear twice in this array.

// Could you do it without extra space and in O(n) runtime?

// Example:

// Input:
// [4,3,2,7,8,2,3,1]

// Output:
// [2,3]

// public class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         Arrays.sort(nums);
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         if (nums.length == 0) {
//         	return arr;
//         }
//         int countforNow = 1;
//         int prev = nums[0];
//         int current = 0;
//         for (int i = 1; i< nums.length;i++ ) {
//         	current = nums[i];
//         	if (current == prev) {
//         		countforNow++;
//         	} else {
//         		if (countforNow == 2) {
//         			arr.add(prev);
//         		}
//         		countforNow = 1;
//         	}
//         	prev = current;	
//         }
//         if (countforNow == 2) {
//         	arr.add(current);
//         }
//         return arr;
//     }
// }O(nlogn)

// public class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//     	ArrayList<Integer> arr = new ArrayList<Integer>();
//     	for (int i = 0; i< nums.length ;i++ ) {
//     		arr.add(nums[i]);
//     	}
//     	for (int i = 0;i <= nums.length ;i++ ) {
//     		arr.remove(new Integer(i));
//     	}
//     	return arr;
//     }
// }Time limit exceeds error

public class Solution {
	//negative marked as seen once, positive marked as never seen before, 
	//similar approach used in find all numbers disappered in an array 448.
    public List<Integer> findDuplicates(int[] nums) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for (int i = 0;i < nums.length ;i++ ) {
    		int index =  Math.abs(nums[i]);
        	if (nums[index - 1] > 0 ) {
    			nums[index - 1] = (-1)*nums[index - 1];
    		} else {
    			arr.add(index);//because you acess this elemen on this index twice, so you should
    			//push this index into the array list, which is the nums[i], the number in this array
    		}
    	}
    	return arr;
    }
}



