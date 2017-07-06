/*
you need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.
The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.
*//**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	String curr = "";
    public String tree2str(TreeNode t) {
       //preorder tranversal
    	if (t == null) {
    		return curr;
    	}

    	curr += t.val;
    	if (t.left != null && t.right != null) {
    		curr += "(";
    		String tem = tree2str(t.left);
    		curr = tem + ")";

    		curr += "(";
    		tem = tree2str(t.right);
    		curr = tem + ")";
    	} else if (t.left == null && t.right != null) {
    		curr += "()";
    		curr += "(";
    		String tem = tree2str(t.right);
    		curr = tem + ")";
    	} else if (t.left != null && t.right == null) {
    		curr += "(";
    		String tem = tree2str(t.left);
    		curr = tem + ")";
    	} else {
    		curr = tree2str(null);
    	}
    	return curr;
    }
}