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
    public TreeNode sortedArrayToBST(int[] nums) {
        return divide(nums,0,nums.length-1);
 
    }
    public static TreeNode divide(int[] nums,int s,int e){
        if(s>e)return null;

        int mid=(s+e)/2;
        TreeNode next=new TreeNode(nums[mid]);
        next.left=divide(nums,s,mid-1);
        next.right=divide(nums,mid+1,e);
        return next;
    }
}