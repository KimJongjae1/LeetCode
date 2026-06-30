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
        return Sy(root.left,root.right);
    }
    public boolean Sy(TreeNode L,TreeNode R){
        if(L!=null&&R!=null){
            if(L.val!=R.val)return false;
            if(Sy(L.right,R.left)&&Sy(L.left,R.right)) return true;
            else return false;
        }
        else if(L==null&&R==null){
            return true;
        }else{
            return false;
        }
    }
}