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
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
*/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	//root is the current ancestor of node p and q
    	if (root == p || root == q) {
    		return root;
    	}

    	if (p.val < root.val && q.val < root.val) {
    		return lowestCommonAncestor(root.left, p,q);
    	} else if (p.val > root.val && q.val > root.val) {
    		return lowestCommonAncestor(root.right, p,q);
    	} else {
    		return root;
    	}


    	// TreeNode testleft = lowestCommonAncestor(root.left, p, q);
    	// TreeNode testright = lowestCommonAncestor(root.right, p,q);
    	// if (testleft == testleft) {
    	// 	return testleft;
    	// }
    	// return root;
        
    }
}