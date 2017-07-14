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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //consider current root with left and right
        if (root == null || root == p || root == q) {
        	return root;
        }//base case

        TreeNode leftSubTree_commonAncestor = lowestCommonAncestor(root.left,p,q);
        TreeNode rightSubTree_commonAncestor = lowestCommonAncestor(root.right, p,q);
        // if leftSubTree_commonAncestor or rightSubTree_commonAncestor is null, which mean no 
        // 	common ancestor fot that subtree

        if (leftSubTree_commonAncestor == null && rightSubTree_commonAncestor == null) {
        	return null;
        } else if (leftSubTree_commonAncestor == null && rightSubTree_commonAncestor != null) {
        	return rightSubTree_commonAncestor;
        } else if (leftSubTree_commonAncestor != null && rightSubTree_commonAncestor == null) {
        	return leftSubTree_commonAncestor;
        } else {
        	return root;
        }
    }

}