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
    List<List<Integer>> list;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        list = new ArrayList<List<Integer>>();
        helper(root, 0);
        return list;
    }

    public void helper(TreeNode root, int depth){
        if (root == null) {
            return ;
        }

        if (list.size() > depth) {
            if ((depth + 1) % 2 == 1) {
                list.get(depth).add(root.val);
            } else {
                list.get(depth).add(0,root.val);
            }
            
        } else {
            List<Integer> l = new ArrayList<Integer>();
            l.add(root.val);
            list.add(l);
        }

        helper(root.left, depth + 1);
        helper(root.right, depth + 1);
    }