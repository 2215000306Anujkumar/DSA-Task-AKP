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
      int sum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        rooter(root);
        return sum;
    }
    public int rooter(TreeNode root)
    {
        if(root==null)return 0;

        int l=Math.max(0,rooter(root.left));
        int r=Math.max(0,rooter(root.right));
        int c=l+r+root.val;
        sum=Math.max(sum,c);
        return Math.max(l,r)+root.val;
    }
}