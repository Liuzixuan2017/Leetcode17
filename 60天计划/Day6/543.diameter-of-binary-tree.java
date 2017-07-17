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
	int longest = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       longestPath(root); 
       return longest;

    }
    public int longestPath(TreeNode node) {
    	if (node == null) {
    		return 0;
    	}
    	int l = longestPath(node.left);
    	int r = longestPath(node.right);
    	if (l+r > longest) {
    		longest = l+r;
    	} 
    	return Math.max(l, r) + 1;
    }
}