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
    static List<Integer> list;
    public List<Integer> rightSideView(TreeNode root) {
        list=new ArrayList<>();
        post(root,0);
        return list;

    }
    public static void post(TreeNode cur,int level){
        if(cur==null)return;

        if(list.size()<=level) list.add(-1);

        post(cur.left,level+1);
        post(cur.right,level+1);

        
        list.set(level,cur.val);
    }
}