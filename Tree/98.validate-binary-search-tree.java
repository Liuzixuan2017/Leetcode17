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
    // public boolean isValidBST(TreeNode root) {

    //     Myresult test = helper(root, 0);
    //     Myresult test1 = helper(root, 1);
    //     if (test1.correct == true && test.correct == true) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
    // public Myresult helper(TreeNode node, int flag) {
    //     //flag = 1: left, 0 : right
    //     if (node == null) {
    //         return new Myresult(null, true);
    //     }
    //     Myresult leftmost = helper(node.left, 1);
    //     Myresult rightmost = helper(node.right, 0);
    //     boolean test = false;
    //     if (leftmost.correct == true && rightmost.correct == true) {
    //         if (leftmost.node.val < node.val && rightmost.node.val > node.val) {
    //             test = true;
    //         }
    //     }
    //     TreeNode put = null;
    //     if (flag == 1) {
    //        put = node.right; 
    //     } else {
    //         put = node.left;
    //     }
    //     Myresult result = new Myresult(put, test);
    //     return result;
    // }

    // public class Myresult{
    //     TreeNode node;
    //     boolean correct;

    //     public Myresult(TreeNode node, boolean correct) {
    //         this.node = node;
    //         this.correct = correct;
    //     }
    // }
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        } 
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}