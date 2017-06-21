/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Given a binary tree, return all root-to-leaf paths.
// ["1->2->5", "1->3"]

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> list = new ArrayList<String>();
    	if (root == null) {
    		return list;
    	}
    	String current = "";
    	toTheNext(root, current, list);
    	return list;
        
    }
    public void toTheNext(TreeNode node, String currentString, List<String> list) {
    	if (node == null) {
    		list.add(currentString);
    		//currentString = "";//this is wrong, the string will be reset
    		return;
    	}
    	if (currentString.isEmpty()) {
    		currentString = currentString + ""+ node.val;
    	} else {
    		currentString = currentString + "->"+ node.val;
    	}

    	//need to check the left node and right node
    	if (node.left == null && node.right != null) {
    		toTheNext(node.right, currentString, list);
    	} else if (node.left != null && node.right == null){
    		toTheNext(node.left, currentString, list);
    	} else if(node.left != null && node.right != null){
    		String dup = currentString;
    		toTheNext(node.left, currentString, list);
    		toTheNext(node.right, dup, list);
    	} else {
    		toTheNext(null, currentString, list);
    	}
    }
}