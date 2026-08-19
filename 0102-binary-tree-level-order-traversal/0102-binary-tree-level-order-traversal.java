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
    static List<List<Integer>> ans;
    public List<List<Integer>> levelOrder(TreeNode root) {
        ans=new ArrayList<>();
        LEVEL(root,1);
        return ans;
    }
    public void LEVEL(TreeNode root,int level){
        if(root==null)return;

        if(ans.size()<level) ans.add(new ArrayList<>());
        
        List<Integer> list=ans.get(level-1);
        list.add(root.val);
        LEVEL(root.left,level+1);
        LEVEL(root.right,level+1);


    }
}