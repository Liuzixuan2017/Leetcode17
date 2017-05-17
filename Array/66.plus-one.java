// Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

// You may assume the integer do not contain any leading zero, except the number 0 itself.

// The digits are stored such that the most significant digit is at the head of the list.

public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length <=0) {
        	return null;
        }
        if (digits[digits.length - 1] < 9) {
        	digits[digits.length - 1] += 1;
        	return digits;
        } else {
        	int start = digits.length - 1;
        	while(start >= 0 && digits[start] == 9) {
        		digits[start] = 0;
        		start--;
        	}
        	if (start >= 0) {
        		digits[start] += 1;
        		return digits;
        	} else {
        		int arr[] = new int[digits.length + 1];
        		for (int i = 0; i < arr.length ;i++ ) {
        			if (i == 0) {
        				arr[i] = 1;
        			} else {
        				arr[i] = 0;
        			}
        		}
        		return arr;
        	}
        }
    }
}