/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static int max;
    static TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        max=0;
        ans=null;
        LEVEL(root,1,p.val,q.val);
        return ans;
    }
    public int LEVEL(TreeNode cur,int level,int P,int Q){
        if(cur==null)return 0;
        
        int n=0;
        if(cur.val==P||cur.val==Q)n++;

        n+=LEVEL(cur.left,level+1,P,Q);
        n+=LEVEL(cur.right,level+1,P,Q);

        if(n==2){
            if(max<level){
               max=level;
               ans=cur; 
            }
        }
      
        return n;



        

    }
}