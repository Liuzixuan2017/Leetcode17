public class Solution {
    public int findPairs(int[] nums, int k) {
    	if (nums.length == 0 || k < 0) {
    		return 0;
    	}
        Arrays.sort(nums);
    	int count = 0;
    	boolean seen = false;
    	int first = nums[0];
    	boolean first_b = true;
    	for (int i = 0; i < nums.length ; i++) {
    		if (nums[i] != first || first_b == true) {
    			seen = false;
    			for (int j = i + 1;j< nums.length;j++ ) {
    				if (Math.abs(nums[i] - nums[j]) == Math.abs(k) && seen == false) {
    					// System.out.println(" " + nums[i] + " " + nums[j]);
    					count++;
    					seen = true;
    				} else if (seen == true) {
    					break;
    				}
    			}
    			first_b = false;
    			first = nums[i];
    		} else {
    			continue;
    		}
    	}
    	// System.out.println(count);
    	return count;
    }
}