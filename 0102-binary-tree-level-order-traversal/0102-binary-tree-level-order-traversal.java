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
        DFS(root,1);
        return ans;
    }
    public static void DFS(TreeNode cur,int level){
        if(cur==null)return;

        if(ans.size()<level)ans.add(new ArrayList<>());

        List<Integer> list=ans.get(level-1);
        list.add(cur.val);
        DFS(cur.left,level+1);
        DFS(cur.right,level+1);
    }
}