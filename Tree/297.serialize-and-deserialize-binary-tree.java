/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// public class Codec {
//     // Encodes a tree to a single string.
//     public String serialize(TreeNode root) {
//     	if (root == null) {
//     		return "";
//     	}
//     	Queue<TreeNode> q = new LinkedList<TreeNode>();
//     	StringBuilder res = new StringBuilder();

//     	q.add(root);
//     	while(q.peek() != null) {
//     		TreeNode node = q.poll();
//     		if (node != null) {
//     			res.append(node.val);
//     			res.append(" ");
//     			q.add(node.left);
//     			q.add(node.right);
//     		} else {
//     			res.append("null");
//     		}
//     	}
//     	return res.toString();   
//     }

//     // Decodes your encoded data to tree.
//     public TreeNode deserialize(String data) {
// 		if (data == "") return null;
//         Queue<TreeNode> q = new LinkedList<>();
//         String[] values = data.split(" ");
//         TreeNode root = new TreeNode(Integer.parseInt(values[0]));
//         q.add(root);

//         for (int i = 0; i < values.length; i++) {
//         	TreeNode parent = q.poll();
//         	int left = 2*i+1;
//         	if (left < values.length ){
//         		if ( values[left].equals("null") == false) {
//         			Integer l = Integer.parseInt(values[left]);
//         			TreeNode left_p = new TreeNode(l);
//         			q.add(left_p);
//         		} else {
//         			q.add(null);
//         		}
//         	}
//         	int right = 2*i+2;
//         	if (right < values.length) {
//         		if(	values[right].equals("null") == false) {
//         			Integer r = Integer.parseInt(values[right]);
//         			TreeNode right_p = new TreeNode(r);
//         			q.add(right_p);
//         		} else {
//         			q.add(null);
//         		}
//         	}	
//         }
//         return root;
//     }
// }

public class Codec {
//     public String serialize(TreeNode root) {
//      if (root == null) {
//          return "";
//      }
//      Queue<TreeNode> q = new LinkedList<TreeNode>();
//      StringBuilder res = new StringBuilder();

//      q.add(root);
//      while(q.peek() != null) {
//          TreeNode node = q.poll();
//          if (node != null) {
//              res.append(node.val);
//              res.append(" ");
//              q.add(node.left);
//              q.add(node.right);
//          } else {
//              res.append("null");
//          }
//      }
//      return res.toString();   
//     }
    // public String serialize(TreeNode root) {
    //     if (root == null) return "";
    //     Queue<TreeNode> q = new LinkedList<>();
    //     StringBuilder res = new StringBuilder();
    //     q.add(root);
    //     while (!q.isEmpty()) {
    //         TreeNode node = q.poll();
    //         if (node == null) {
    //             res.append("n ");
    //             continue;
    //         }
    //         res.append(node.val + " ");
    //         q.add(node.left);
    //         q.add(node.right);
    //     }
    //     return res.toString();
    // }
//     public TreeNode deserialize(String data) {
//      if (data == "") return null;
//         Queue<TreeNode> q = new LinkedList<>();
//         String[] values = data.split(" ");
//         TreeNode root = new TreeNode(Integer.parseInt(values[0]));
//         q.add(root);

//         for (int i = 0; i < values.length; i++) {
//          TreeNode parent = q.poll();
//          int left = 2*i+1;
//          if (left < values.length ){
//              if ( values[left].equals("null") == false) {
//                  Integer l = Integer.parseInt(values[left]);
//                  TreeNode left_p = new TreeNode(l);
//                  q.add(left_p);
//              } else {
//                  q.add(null);
//              }
//          }
//          int right = 2*i+2;
//          if (right < values.length) {
//              if( values[right].equals("null") == false) {
//                  Integer r = Integer.parseInt(values[right]);
//                  TreeNode right_p = new TreeNode(r);
//                  q.add(right_p);
//              } else {
//                  q.add(null);
//              }
//          }   
//         }
//         return root;
//     }
    // public TreeNode deserialize(String data) {
    //     if (data == "") return null;
    //     Queue<TreeNode> q = new LinkedList<>();
    //     String[] values = data.split(" ");
    //     TreeNode root = new TreeNode(Integer.parseInt(values[0]));
    //     q.add(root);
    //     for (int i = 1; i < values.length; i++) {
    //         TreeNode parent = q.poll();
    //         if (!values[i].equals("n")) {
    //             TreeNode left = new TreeNode(Integer.parseInt(values[i]));
    //             parent.left = left;
    //             q.add(left);
    //         }
    //         if (!values[++i].equals("n")) {
    //             TreeNode right = new TreeNode(Integer.parseInt(values[i]));
    //             parent.right = right;
    //             q.add(right);
    //         }
    //     }
    //     
    public String serialize(TreeNode root) {
        StringBuilder b = new StringBuilder();
        helper1(root, b);
        return b.toString();

    }
    public void helper1(TreeNode root, StringBuilder b) {
        if (root == null) {
            b.append("null");
            b.append(",");
            return ;
        }
        b.append(root.val);
        b.append(",");
        helper1(root.left,b);
        helper1(root.right, b);
    }

    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(",")));
        return helper2(nodes);
    }

    public TreeNode helper2(Deque<String> dq) {
        String s = dq.remove();
        if (s.equals("null") == true) {
            return null;
        } else {
            TreeNode node = new TreeNode(Integer.parseInt(s));
            node.left = helper2(dq);
            node.right = helper2(dq);
            return node;
        }
    }

}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));