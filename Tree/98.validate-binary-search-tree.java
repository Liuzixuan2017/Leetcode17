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
    public boolean isValidBST(TreeNode root) {
    	if (root == null) {
    		return true;
    	}
        if (root.left.val < root.val && root.right.val > root.val) {
        	boolean l = isValidBST(root.left);
        	boolean r = isValidBST(root.right);
        	if (l == false || r == false) {
        		return false;
        	} else {
        		return true;
        	}
        } else {
        	return false;
        }
        
    }
}