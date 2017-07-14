public class Solution {
    public void rotate(int[] nums, int k) {
    	if (k % nums.length == 0) {
    		return ;
    	}
    	k = k % nums.length;
        // Collections.reverse(nums);

        //reverse the whole array
        for (int i = 0; i < nums.length/2; i++ ) {
        	int temp = nums[i];
        	nums[i] = nums[nums.length -1 -i];
        	nums[nums.length -1 -i] = temp;
        }

        //reverse the first k elements
        for (int i = 0; i < k/2; i++ ) {
        	int temp = nums[i];
        	nums[i] = nums[k -1 -i];
        	nums[k-1 -i] = temp;
        }

        //reverse the rest
        for (int i = 0; i < (nums.length - k)/2; i++) {
        	int temp = nums[i + k];
        	nums[i + k] = nums[nums.length - 1 - i];
        	nums[nums.length - 1 - i] = temp;
        }
    }
}