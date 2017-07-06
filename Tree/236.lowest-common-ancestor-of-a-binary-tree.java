/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//given a binary tree not a binary search tree

//Same solution in several languages. It's recursive and expands the meaning of the function. If the current (sub)tree contains both p and q, then the function result is their LCA. If only one of them is in that subtree, then the result is that one of them. If neither are in that subtree, the result is null/None/nil.
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) {
    	return root;
    }
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    if (left ==  null && right == null) {
    	return null;
    } else if(left != null && right == null) {
    	return left;
    } else if (left == null && right != null) {
    	return right;
    } else {
    	return root;
    }
    // if (left == null) {
    // 	return right;
    // } else {
    // 	if (right == null) {
    // 		return left;
    // 	} else {
    // 		return root;
    // 	}
    // }

    //return left == null ? right : right == null ? left : root;
}

    // public int findNode(TreeNode node, TreeNode p, int depth) {
    // 	if (node == null) {
    // 		return -1;
    // 	}
    // 	if (node.val == p.val) {
    // 		return depth;
    // 	}
    // 	return findNode(node.left, p, depth+1);
    // 	return findNode(node.right, p, depth+1);
    // }
}