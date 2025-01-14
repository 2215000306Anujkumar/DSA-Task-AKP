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
    public TreeNode getBST(int[] nums , int start , int end){
        if(start > end) return null;

        int middle = (start + end)/2;
        TreeNode bst = new TreeNode(nums[middle]);
        bst.left = getBST(nums , start , middle-1);
        bst.right = getBST(nums, middle+1 , end);
        return bst;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return getBST(nums , 0 , nums.length-1);

    }
}