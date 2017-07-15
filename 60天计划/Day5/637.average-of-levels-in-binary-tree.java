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
    public List<Double> averageOfLevels(TreeNode root) {
        //level order tranversal and calculate the average for each level
        if (root == null) {
        	return null;
        }
        List<Double> list = new ArrayList<Double>();
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        q.add(root);
        // q.add(null);
        int countforLevel = 1;
        double sum = 0;
        while(q.peek() != null) {
        	int count = 0;
        	sum = 0;
        	for (int i = 0; i< countforLevel; i++) {
        		TreeNode node = q.poll();
        		sum = sum + node.val / ((1.0) * countforLevel);
        		if (node.left != null) {
        			q.add(node.left);
        			count++;
        		}
        		if (node.right != null) {
        			q.add(node.right);
        			count++;
        		}
        	}
        	// q.add(null);
        	list.add(sum);
        	countforLevel = count;
        }
        return list;
    }
}