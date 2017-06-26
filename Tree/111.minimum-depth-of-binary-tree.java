/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Given a binary tree, find its minimum depth.

// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
public class Solution {
  	int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	helper(root, 1);
    	return min;
    }

    public void helper(TreeNode root, int depth) {
    	if (root == null) {
    		if (depth < min) {
    			min = depth;
    		}
    		return;
    	}

		if (root.left != null) {
			helper(root.left, depth + 1);    		
		}    	
    	if (root.right != null) {
    		helper(root.right, depth + 1);
    	}

    	if (root.left == null && root.right == null) {
    		helper(null, depth);
    	}
    	return;
    }
    // public class Solution {
    // public int minDepth(TreeNode root) {
    //     if (root == null) {
    //         return 0;
    //     }
        
    //     int left = minDepth(root.left);
    //     int right = minDepth(root.right);
        
    //     if (left == 0 || right == 0) {
    //         return Math.max(left, right) + 1;
    //     }
        
    //     return Math.min(left, right) + 1;
    // }
}
}