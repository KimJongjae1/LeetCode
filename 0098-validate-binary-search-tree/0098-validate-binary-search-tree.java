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
    public boolean isValidBST(TreeNode root) {
        
        return DFS(Long.MIN_VALUE,Long.MAX_VALUE,root);
    }
    public boolean DFS(long min,long max,TreeNode cur){
        if(cur==null)return true;

        if(cur.val<=min|max<=cur.val)return false;
        if(!DFS(min,cur.val,cur.left)||!DFS(cur.val,max,cur.right))return false;
        return true;
    }
}