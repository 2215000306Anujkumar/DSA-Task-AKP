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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return mirror(root.left , root.right);
    }
    public boolean mirror(TreeNode n1 , TreeNode n2){
        if(n1==null && n2==null) return true;
        if(n1==null || n2==null || n1.val != n2.val) return false;
        return mirror(n1.left , n2.right) && mirror(n1.right , n2.left);
    }
}