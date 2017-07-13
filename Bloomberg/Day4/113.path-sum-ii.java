/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	List<List<Integer>> path = new ArrayList<List<Integer>>();
	int total;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        this.total = sum;
        helper(root, 0, new ArrayList<Integer>());
        return path;
    }

    public void helper(TreeNode root, int currentSum, ArrayList<Integer> arr) {
    	if (root == null) {
    		return ;
    	}
    	arr.add(root.val);
    	if (currentSum + root.val == total && root.left == null && root.right == null) {
    		path.add(arr);
    	}
    	ArrayList<Integer> copy = (ArrayList<Integer>) arr.clone();
    	helper(root.left, currentSum + root.val, arr);
    	helper(root.right, currentSum + root.val, copy);
    }


}