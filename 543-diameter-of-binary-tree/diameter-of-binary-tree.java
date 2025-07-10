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
 int maxDia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDia;
    }
    public int depth(TreeNode node){
        if(node == null) return 0;

        int leftH = depth(node.left);
        int rightH = depth(node.right);
        maxDia = Math.max(maxDia , (leftH + rightH));

        return  Math.max(leftH , rightH)+1;
    }
}