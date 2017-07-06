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
	List<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
    	helper(root, 0);
    	return list;
    }

    public void helper(TreeNode root, int depth) {
    	if (root == null) {
    		return ;
    	}

    	if (list.size() == depth) {
    		List<Integer> l = new ArrayList<Integer>();
    		l.add(root.val);
    		list.add(l);
    	} else {
    		list.get(depth).add(root.val);
    	}

    	helper(root.left, depth +1);
    	helper(root.right, depth+1);
    }
}