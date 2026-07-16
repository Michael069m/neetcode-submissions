/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean contains(TreeNode root, TreeNode node){
        if(root==null) return false;
        if(root.val == node.val) return true;
        return contains(root.left,node) || contains(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val == p.val || root.val == q.val) return root;
        boolean l = contains(root.left,p) || contains(root.left,q);
        boolean r = contains(root.right,p) || contains(root.right,q);
        if(l==true && r == true) return root;
        if(l == true) return lowestCommonAncestor(root.left,p,q);
        if(r == true) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}
