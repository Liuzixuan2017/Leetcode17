/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Given a binary tree, find its maximum depth.

// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
public class Solution {
	// int max = 0;
    public int maxDepth(TreeNode root) {
 //    	if (root == null) {
 //    		return 0;
 //    	}
 //    	int depth = 0;
 //    	tranverse(root, depth);
 //    	return max;
 //    }
 //    public void tranverse(TreeNode node, int depth) {
 //    	if (node == null) {
 //    		if (depth > max) {
 //    			max = depth;
 //    		}
 //    		return;
 //    	}
 //    	depth++;
 //    	int dup = depth;
 //    	if (node.left != null || node.right != null) {
 //    		if (node.left != null) {
 //    			tranverse(node.left, depth);	
 //    		} 
 //    		if (node.right != null) {
 //    			tranverse(node.right, dup);
 //    		}
 //    	} else {
 //    		tranverse(null, depth);
 //    	}

	//simple solution
    	if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
    }

  //   public int maxDepth(TreeNode root) {
		// int depth = 0;
		// if (root != null) {
		// 	int left = maxDepth(root.left);
		// 	int right = maxDepth(root.right);
		// 	depth = left > right ? left + 1 : right + 1;
		// }
		// return depth; 
  //   }

}