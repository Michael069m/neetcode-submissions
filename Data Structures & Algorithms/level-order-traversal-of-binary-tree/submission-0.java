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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();    
        if(root == null) return ans;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            TreeNode node = q.peek().a;
            int i = q.poll().b;
            if(i == ans.size()){
                ans.add(new ArrayList<>());
            }
            ans.get(i).add(node.val);
            if(node.left!=null) q.add(new Pair(node.left,i+1));
            if(node.right!=null) q.add(new Pair(node.right,i+1));
        }
        return ans;
    }
}
class Pair{
    TreeNode a;
    int b;
    Pair(TreeNode a, int b){
        this.a = a;
        this.b = b;
    }
}
