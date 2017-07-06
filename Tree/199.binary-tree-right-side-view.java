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
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
*/
public class Solution {
	//level traversal and add the the right most of each level to the arraylist
  //   public List<Integer> rightSideView(TreeNode root) {
  //   	List<Integer> list = new ArrayList<Integer>();
		// Queue<TreeNode> q = new ArrayDeque<TreeNode>();
		// if (root == null) {
		// 	return list;
		// }
  //       q.add(root);
  //       list.add(root.val);
  //       int levelNode = 1;
  //       int count = 1;
  //       while(q.peek() != null) {
  //       	int current = 0;
  //       	for (int i = 0; i < levelNode; i++) {
  //       		TreeNode node = q.poll();
  //       		//System.out.print(" current node is " + node.val);
  //       		if (node.left != null) {
  //       			q.add(node.left);
  //       			current++;
  //       			//System.out.print(" count " + count + " left " + node.left.val);
  //       			list.add(count ,node.left.val);
  //       		}
  //       		if (node.right != null) {
  //       			q.add(node.right);
  //       			current++;
  //       			//System.out.print(" count " + count + " right " + node.right.val);
  //       			if (list.size() <= count) {
  //       				list.add(count,node.right.val);
  //       			} else {
  //       				list.set(count,node.right.val);
  //       			}
        			
  //       		}
  //       	}
  //       	count++;
  //       	levelNode = current;
  //       }
  //       return list;
  //   }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, 0, list);
        return list;
    }
    public void helper(TreeNode node, int depth, List<Integer> list) {
        if (node == null) {
            return ;
        }

        if (list.size() == depth) {
            list.add(node.val);
        }

        helper(node.right, depth + 1, list);
        helper(node.left, depth + 1, list);
    }
}
