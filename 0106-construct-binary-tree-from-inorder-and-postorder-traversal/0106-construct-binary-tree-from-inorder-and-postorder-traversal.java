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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        N=postorder.length;
        TreeNode root=new TreeNode(postorder[N-1]);
        int start=0;
        map=new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(postorder[i],i);
            if(postorder[N-1]==inorder[i])
            start=i;
        }
        in=inorder;
        post=postorder;
        root.left=build(0,start-1);
        root.right=build(start+1,N-1);
        return root;
    }
    public static TreeNode build(int left,int right){
        if(left>right)return null;
       
        int idx=-1;
        int inidx=0;
 
        for(int i=left;i<=right;i++){
            int temp=map.get(in[i]);
            if(idx<temp){
               idx= temp;
                inidx=i;
            }
        }
 
        TreeNode cur=new TreeNode(post[idx]);
        cur.left=build(left,inidx-1);
        cur.right=build(inidx+1,right);

        return cur;
    }
}