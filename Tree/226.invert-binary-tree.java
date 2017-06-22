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
    public TreeNode invertTree(TreeNode root) {
    //     helper(root);
    //     return root;
    // }

    // public void helper(TreeNode root) {
    // 	if (root == null) {
    //     	return;
    //     }

    //     TreeNode temp =  root.left;
    //     root.left = root.right;
    //     root.right = temp;

    //     invertTree(root.left);
    //     invertTree(root.right);
    //top-down recursive

    	//down-up recursive
    	if (root == null) {
    		return null;
    	}
    	TreeNode left_p = invertTree(root.left);
    	TreeNode right_p = invertTree(root.right);

    	// TreeNode temp = left_p;
    	// left_p = right_p;
    	// right_p = temp;
    	//only changes the pointer points to but not change actual node
    	root.left = root.right;
    	root.right = left_p;

    	return root;
    }
}