public class Solution {
    public int findDuplicate(int[] nums) {
    	int oneStep = 0;//index of slow one
    	int twoStep = 0;//index of fast one

    	while(true) {
    		oneStep = nums[oneStep];
    		twoStep = nums[nums[twoStep]];
    		if (oneStep == twoStep) {
    			break;
    		}
    	}
    	//oneStep and twoStep, reset the twostep
    	twoStep = 0;
    	while (true) {
    		oneStep = nums[oneStep];
    		twoStep = nums[twoStep];
    		if (oneStep == twoStep) {
    			break;
    		}
    	}
    	return oneStep;
    }
}