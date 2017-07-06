/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


/*
Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.
*/
public class Solution {
	int sum = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	helper(root, hm);
    	ArrayList<Integer>arr = new ArrayList<Integer>();
    	for (Integer i : hm.keySet()) {
    		int count = hm.get(i);
    		if (arr.isEmpty() == true) {
    			arr.add(i);
    		} else {
    			int compare = hm.get(arr.get(0));
    			if (count == compare) {
    				arr.add(i);
    			} else if (count > compare) {
    				arr.clear();
    				arr.add(i);
    			} 
    		}
    	}
    	int r[] = new int[arr.size()];
    	int c = 0;
    	for (Integer i: arr ) {
    		r[c++] = i;
    	}
    	return r;     
    }

    public int helper(TreeNode root, HashMap hm) {
    	if (root == null) {
    		return 0;
    	}
    	int s1 = helper(root.left,hm);
    	int s2 = helper(root.right,hm);
    	int s = s1+s2+root.val;
    	if (hm.containsKey(s) == true) {
    		int temp = (int)hm.get(s);
    		hm.put(s, temp+1);
    	} else {
    		hm.put(s,1);
    	}
    	return s;
    }
}