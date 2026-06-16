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
    static int N;
    static Map<Integer,Integer> map;
    static int[] in;
    static int[] post;
    static int IDX;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        N=postorder.length;
        IDX=N-1;
        map=new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(inorder[i],i);
        }
        in=inorder;
        post=postorder;
        
        return build(0,N-1);
    }
    public static TreeNode build(int left,int right){
        if(left>right)return null;
       
        
        int inidx=map.get(post[IDX]);
        TreeNode cur=new TreeNode(post[IDX--]);
        
        cur.right=build(inidx+1,right);
        cur.left=build(left,inidx-1);

        return cur;
    }
}