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
    // public boolean isSubtree(TreeNode s, TreeNode t) {
    // 	if (s == null || t == null) {
    // 		return false;
    // 	}
    // 	StringBuilder sb1 = new StringBuilder();
    // 	StringBuilder sb2 = new StringBuilder();
    //     StringBuilder s1 = preorder(s, sb1);
    //     StringBuilder s2 = preorder(t, sb2);
    //     return s1.toString().contains(s2.toString());
    // }

    // public StringBuilder preorder(TreeNode node , StringBuilder sb) {
    // 	if (node == null) {
    // 		sb.append(",");
    // 		sb.append("null");
    // 		return sb;
    // 	}
    // 	sb.append(",");
    // 	sb.append(node.val);
    // 	StringBuilder left = preorder(node.left, sb);
    // 	StringBuilder right = preorder(node.right,left);
    // 	return right;
    // }

    // public boolean isSubtree(TreeNode s, TreeNode t) {
    //     if (s == null && t == null) {
    //         return true;
    //     }
    //     if (s == null && t != null || s != null && t == null) {
    //         return false;
    //     }
    //     if (s.val == t.val) {
    //         if(isSubtree(s.left, t.left) && isSubtree(s.right, t.right)){
    //         	return true; //this is difinite true
    //         } else {
    //         	//even the condition is wrong, but it still can be true;
    //         	return isSubtree(s.left, t) || isSubtree(s.right, t);
    //         }  
    //     } else {
    //         return isSubtree(s.left, t) || isSubtree(s.right, t);
    //     }
    // }
    public boolean isSubtree(TreeNode s, TreeNode t) {
    	return check(s, t, false);
    }
    public boolean check(TreeNode s, TreeNode t, boolean startcheck) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        //once you start check whether it is a substring you cannot stop in the middle
        if (s.val == t.val) {
            if(check(s.left, t.left, true) && check(s.right, t.right, true)){
                return true; //this is difinite true
            } else {
                //even the condition is wrong, but it still can be true;
                return check(s.left, t, false) || check(s.right, t, false);
            }
        } else {
            if (startcheck) {
                //once two nodes do not have the same values but it already started check, return false
                return false;
            } else {
                return check(s.left, t, false) || check(s.right, t, false);
            }
        }
    }
}