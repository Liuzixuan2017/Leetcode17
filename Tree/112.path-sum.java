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
    public boolean hasPathSum(TreeNode root, int sum) {
    	//if it has reached the leaf node but still find the correct sum, return false
        if (root == null) {
        	return false;
        }
        //if it finds the current node has the correct value to meet sum and it is the leaf node, return true
        if (root.val == sum && root.left == null && root.right == null) {
        	return true;
        }
        //go to either its left node or its right node and find whther they have correct value (sum - all nodes met so far)
        return (hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum-root.val));
    }
}