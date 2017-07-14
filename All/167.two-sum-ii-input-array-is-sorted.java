// Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

// The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

// You may assume that each input would have exactly one solution and you may not use the same element twice.

// Input: numbers={2, 7, 11, 15}, target=9
// Output: index1=1, index2=2


// public class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         if (numbers.length == 0 || target < numbers[0] || target > 2*numbers[numbers.length-1]) {
//         	return null;
//         }
//         int arr[] = new int[2];
//         for (int i = 0; i < numbers.length ;i++ ) {
//         	for (int j = i+1;j < numbers.length;j++ ) {
//         		if (numbers[i] + numbers[j] == target) {
//         			arr[0] = i+1;
//         			arr[1] = j+1;
//         			return arr;
//         		} else if(numbers[i] + numbers[j] > target) {
//         			break;
//         		}
//         	}
//         }
//         return arr;
//     }
    
// } bruce-forece solution

//quick solution O(n)
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0 || target < numbers[0] || target > 2*numbers[numbers.length-1]) {
        	return null;
        }
        int left = 0;
        int right  = numbers.length - 1;
        int arr[] = new int[2];
        while (left != right) {
        	if (numbers[left] + numbers[right] == target) {
				arr[0] = left + 1;
        		arr[1] = right + 1;
        		return arr;
        	} else if (numbers[left] + numbers[right] < target) {
        		left++;
        	}else{
        		right--;
        	}
        }
        return arr;
    }
}