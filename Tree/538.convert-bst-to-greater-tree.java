/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
*/
public class Solution {
	int prev = 0;
    public TreeNode convertBST(TreeNode root) {
   	//right -> parent -> left
    	helper(root);
    	return root;
    }

    public void helper(TreeNode root) {
    	if (root == null) {
    		return ;
    	}

    	helper(root.right);
    	//System.out.print(" " + prev + " ");
    	root.val += prev;
    	prev = root.val;
    	//System.out.print(" " + prev + " ");
    	helper(root.left );
    	//System.out.print(" " + prev + " ");

    }


}