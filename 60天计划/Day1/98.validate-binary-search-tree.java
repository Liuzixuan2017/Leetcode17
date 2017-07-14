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
        double min = Double.NEGATIVE_INFINITY;
        double max = Double.POSITIVE_INFINITY;
        return testBst(root, min, max);
    }

    public boolean testBst(TreeNode root, double min, double max) {
    	if (root == null) {
    		return true;
    	}

    	if (root.val <= min || root.val >= max) {
    		return false;
    	}

    	return testBst(root.left, min, root.val) && testBst(root.right, root.val, max);
    }
}