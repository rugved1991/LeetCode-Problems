/*
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to

     4
   /   \
  7     2
 / \   / \
9   6 3   1
*/

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
    public TreeNode invertTree(TreeNode root) {
     
     if(root!=null)
     {
         invert(root);
     }
     return root;
    }
    
    public void invert(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        
        TreeNode left=node.left;
        TreeNode right=node.right;
        
        if(left!=null)
        {
            invert(left);
        }
        if(right!=null)
        {
            invert(right);
        }
        
        node.left=right;
        node.right=left;
    }
}