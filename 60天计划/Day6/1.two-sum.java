import java.util.Hashtable;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable <Integer, Integer> table = new Hashtable<>();
        int[] sol = new int[2];
        for (int i = 0; i < nums.length; i++) {
        	table.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
        	int s1 = nums[i];
        	int diff = target - s1;
        	if (table.containsKey(diff) == true && table.get(diff) != i) {
        		sol[0] = i;
        		sol[1] = table.get(diff);
        		break;
        	}
        }
        return sol;
    }
}