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
    int ans = 0;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        helper(root.left,root.val);
        helper(root.right,root.val);
        return ans+1;
    }
    public void helper(TreeNode root, int x){
        if(root == null) return ;
        System.out.println(x +" " + root.val);
        if(root.val >= x) {
            ans++;
        }
        helper(root.left, Math.max(root.val,x));
        helper(root.right,Math.max(root.val,x));
    }
}
