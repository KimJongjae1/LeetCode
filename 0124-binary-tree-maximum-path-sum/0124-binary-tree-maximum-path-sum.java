
class Solution {
    static int MAX=0;
    public int maxPathSum(TreeNode root) {
        MAX=root.val;
        sum(root);
        return MAX;
    }
    public int sum(TreeNode root){
        if(root==null)return 0;
        int sum=root.val;

        int L=sum(root.left);
        int R=sum(root.right);
        int s=sum;
        if(L>0)s+=L;
        if(R>0)s+=R;
        MAX=Math.max(MAX,s);

        return Math.max(sum,sum+Math.max(L,R));
    }
}