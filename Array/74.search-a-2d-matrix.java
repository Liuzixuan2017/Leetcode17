// Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.
// For example,

// Consider the following matrix:

// [
//   [1,   3,  5,  7],
//   [10, 11, 16, 20],
//   [23, 30, 34, 50]
// ]
// Given target = 3, return true.


public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    		return false;
    	}
    	int row = matrix.length;
    	int column = matrix[0].length;
    	int start = 0;
    	int end = row * column - 1;
    	while(start <= end) {
    		int index = (start + end) / 2;
    		int val = matrix[index / column][index %column];
    		if (val == target) {
    			return true;
    		} else if (val > target) {
    			end = index - 1;
    		} else {
    			start = index + 1;
    		}
    	}
    	return false;	
    }
}