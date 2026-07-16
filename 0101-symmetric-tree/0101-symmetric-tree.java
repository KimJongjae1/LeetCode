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
        return sy(root.left,root.right);
    }
    public boolean sy(TreeNode R,TreeNode L){
        if(R==null&&L==null)return true;
        if(R!=null&&L!=null){
            if(R.val!=L.val)return false;
            if(sy(R.left,L.right)&&sy(R.right,L.left))return true;
            return false;
        }
        return false;
    }
}