import java.util.*;
public class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        //this is the final answer list
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        //use hash table to avoid duplicates
        Hashtable<ArrayList<Integer>, Integer> table = new Hashtable<ArrayList<Integer>,Integer>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++ ) {
            int tar = 0 - nums[i];
            int subNums[] = Arrays.copyOfRange(nums, i+1, nums.length);
            boolean found = twoSum(subNums, tar);
            if (found == true) {
                for (int j = 0; j < arr.size(); j += 2) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(arr.get(j));
                    list.add(arr.get(j+1));
                    if (!table.containsKey(list)) {
                        ans.add(list);
                        table.put(list,0);
                    }
                }
            }
        }
        return ans;
    }
    public boolean twoSum(int[] subNums, int tar) {
//        //the subNums passed is sorted
        arr = new ArrayList<>();
        int temp1 = 0;
        int temp2 = subNums.length -1;
        while (temp1 < temp2) {
            if (subNums[temp1] + subNums[temp2] < tar) {
                temp1++;
            } else if (subNums[temp1] + subNums[temp2] > tar) {
                temp2--;
            } else {
                arr.add(subNums[temp1]);
                arr.add(subNums[temp2]);
                temp1++;
                temp2--;
            }
        }
        if (arr.size() == 0) {
            return false;
        } else {
            return true;
        }
    }
}