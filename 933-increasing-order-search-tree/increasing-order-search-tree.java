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
    public void inorder(TreeNode root , List<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left , list);
        list.add(root.val);
        inorder(root.right , list);
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        TreeNode dummyroot = new TreeNode(0);
        TreeNode current = dummyroot;
        for(int v : list)
        current = current.right = new TreeNode(v);
        return dummyroot.right;
    }
}