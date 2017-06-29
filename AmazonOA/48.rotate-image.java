// You are given an n x n 2D matrix representing an image.

// Rotate the image by 90 degrees (clockwise).

// Follow up:
// Could you do this in-place?

public class Solution {
    public void rotate(int[][] matrix) {
    	// Queue<Integer> q = new ArrayDeque<Integer>();
     //    for (int i = 0; i < matrix.length; i++ ) {
     //    	for (int j = 0; j < matrix[0].length; j++ ) {
     //    		q.add(matrix[i][j]);
     //    	}
     //    }
     //   	for (int i = 0; i < matrix.length; i++) {
     //   		int col = matrix.length -1 -i;
     //   		for (int j = 0; j < matrix.length; j++) {
     //   			matrix[j][col] = q.poll();
     //   		}
     //   	}
     //   	return;
    //two slow

    	//first exchange the first row and last row and do the transpose
    	for (int i = 0; i < matrix.length/2 ; i++ ) {
    		int arr[] = matrix[i];
    		matrix[i] = matrix[matrix.length - 1 - i];
    		matrix[matrix.length - 1 - i] = arr;
    	}
    	//matrix[i][j] = matrix[j][i];
    	for (int i = 0; i < matrix.length; i++ ) {
    		for (int j = 0; j < matrix.length; j++ ) {
    			if (j > i){
    				int temp = matrix[i][j];
    				matrix[i][j] = matrix[j][i];
    				matrix[j][i] = temp;
    			}
    		}
    	}
    	return ;
    }
}