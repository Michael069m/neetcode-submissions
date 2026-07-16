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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null ) return -1;
        // int rank = rank(root.left)+1;
        // if(rank == k ) return root.val;
        // if(rank < k ) return kthSmallest(root.right,k-rank);
        // else {
            
        // }
        helper(root,k);
        return ans;
    }
    int ans = 0;
    int i = 0;
    public void helper(TreeNode root, int k){
        if(i>k) return;
        if(root == null ) return;
        helper(root.left, k );
        i++;
        if(i==k) ans = root.val;
        helper(root.right,k);
    }
    // public int rank(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     return rank(root.left) + rank(root.right) + 1;
    // }
}
