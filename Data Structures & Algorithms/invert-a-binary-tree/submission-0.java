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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode left = null;
        TreeNode right = null;
        if(root.left!=null) left = root.left;
        if(root.right!=null) right = root.right;
        // root.right = left;
        // root.left = right;
        root.right = invertTree(left);
        root.left = invertTree(right);
        return root;
    }
}
