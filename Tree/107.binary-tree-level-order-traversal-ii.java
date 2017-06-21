/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	// List<List<Integer>> l = new ArrayList<List<Integer>>();
    	// if (root == null) {
    	// 	return l;
    	// }
     //   int currentNumberOfNodes = 1;
     //   Queue<TreeNode> q = new ArrayDeque<TreeNode>();
     //   q.add(root);
     //   List<Integer> inner = new ArrayList<Integer>();
     //   inner.add(root.val);
     //   l.add(0,inner);
     //   while (q.peek() != null) {
     //    	inner = new ArrayList<Integer>();
     //    	int update = 0;
     //    	for (int i = 0; i < currentNumberOfNodes;i++ ) {
     //    		TreeNode current = q.poll();
     //    		if (current.left != null) {
     //    			q.add(current.left);
     //    			inner.add(current.left.val);
     //    			update++;	
     //    		}
     //    		if (current.right != null) {
     //    			q.add(current.right);
     //    			inner.add(current.right.val);
     //    			update++;
     //    		}
     //    	}
     //    	if (inner.isEmpty()==false) {
     //    		l.add(0,inner);
     //    	}
     //    	currentNumberOfNodes = update;
     //    }
     //    return l; non-recursive method


    	//recursive method

    	//create an empty list of list
    	List<List<Integer>> l = new ArrayList<List<Integer>>();
    	levelRecursion(root, l, 0);
    	//reverse the order of list
    	Collections.reverse(l);
    	return l;
    }

    	public void levelRecursion(TreeNode node, List<List<Integer>> list, int level){
    		//if it reaches the end of the tree, return it 
    		if (node == null) {
    			return ;
    		}
    		//if the size of arraylist if less than its level, add a new arraylist to the list for emelements in a new level
    		if (list.size() < level + 1) {
    			List<Integer> inner = new ArrayList<Integer>();
    			list.add(inner);
    		}
    		list.get(level).add(node.val);
    		levelRecursion(node.left, list, level+1);
    		levelRecursion(node.right, list, level + 1);
    	}    
}