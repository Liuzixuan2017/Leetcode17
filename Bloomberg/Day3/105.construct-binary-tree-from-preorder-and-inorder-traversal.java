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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length == 0) {
        	return null;
        }
        TreeNode node = new TreeNode(preorder[0]);

        int idx = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]){
                idx = i;
            }
        }
        int leftlength = idx;
        int left1 [] = new int[0];
        if (preorder.length > 1) {
        	left1 = Arrays.copyOfRange(preorder, 1, 1 + leftlength);
        }

        int left2 [] = new int[0];
        if (inorder.length > 0) {
        	left2 = Arrays.copyOfRange(inorder, 0, idx);
        }
        
        int right1[] = new int[0];
        if (preorder.length > 1+leftlength) {
        	right1 = Arrays.copyOfRange(preorder, 1+leftlength, preorder.length);
        }
        
        int right2[] = new int[0];
        if (inorder.length > idx + 1) {
        	right2 = Arrays.copyOfRange(inorder,idx + 1, inorder.length);
        }       
        TreeNode leftnode = buildTree(left1, left2);
        TreeNode rightnode = buildTree(right1, right2);
        node.left = leftnode;
        node.right = rightnode;
        return node;
    }
}