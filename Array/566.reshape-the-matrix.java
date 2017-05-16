public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r*c != nums.length * nums[0].length) {
        	return nums;
        }
        int array[] = new int[r*c];
        int count = 0;
        for (int i = 0; i < nums.length;i++) {
        	for (int j = 0; j < nums[0].length ;j++ ) {
        		array[count++] = nums[i][j];
        	}
        }
        count  = 0;
        int[][] resize = new int[r][c];
        for (int i = 0; i< r ;i++ ) {
        	for (int j = 0; j < c; j++ ) {
        		resize[i][j] = array[count++];
        	}
        }
        return resize;
    }
}