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
    public List<TreeNode> generateTrees(int n) {

        return tree(1,n);
         
    }
    public List<TreeNode> tree(int start,int end){
        List<TreeNode> list=new ArrayList<>();

        if(start>end){
            list.add(null);
            return list;
        }

        for(int i=start;i<=end;i++){
            List<TreeNode> L=tree(start,i-1);
            List<TreeNode> R=tree(i+1,end);

            for(TreeNode Left:L){
                for(TreeNode Right:R){
                    TreeNode root=new TreeNode(i);
                    root.left=Left;
                    root.right=Right;
                    list.add(root);
                }
            }
        }
        return list;
            



    }
     
   
}