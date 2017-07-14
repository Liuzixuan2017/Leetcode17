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
	int ans = 0;
	int count = 1;
    public int kthSmallest(TreeNode root, int k) { 
        helper(root, k);
        return ans;
    }
    public void helper(TreeNode root, int k) {
    	if (root == null ) {
    		return ;
    	}
    	helper(root.left, k);
    	if (count == k) {
    		ans = root.val;
    	}
    	count++;
    	helper(root.right, k);
    }
 }

