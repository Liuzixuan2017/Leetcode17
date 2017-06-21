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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        tranverse(root, l, 0);
        return l;

    }
    public void tranverse(TreeNode node, List<List<Integer>> list, int level) {
    	if (node == null) {
    		return;
    	}
    	if (list.size() < level +1) {
    		List<Integer> inner = new ArrayList<Integer>();
    		list.add(inner);
    	}
    	list.get(level).add(node.val);
    	tranverse(node.left, list, level+1);
    	tranverse(node.right, list, level+1);
    }
}