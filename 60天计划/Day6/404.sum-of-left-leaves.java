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
	int sumOfLeves = 0;
    public int sumOfLeftLeaves(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	findSum(root.left, true);
    	findSum(root.right, false);
    	return sumOfLeves;
    }

    public void findSum(TreeNode node, boolean isleft) {
    	if (node == null) {
    		return ;
    	}
    	//whether current node is a leaf
    	if (node.left == null && node.right == null && isleft == true) {
    		sumOfLeves += node.val;
    		return ;
    	}
    	findSum(node.left, true);
    	findSum(node.right, false);
    }	
}