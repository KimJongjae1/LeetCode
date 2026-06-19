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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        List<Double> ans=new ArrayList<>();
        ans.add((double)root.val);
        qu.offer(root);
        while(true){
            int size=qu.size();
            double n=0;
            for(int i=0;i<size;i++){
                TreeNode cur=qu.poll();

                if(cur.left!=null){
                    n+=cur.left.val;
                    qu.offer(cur.left);
                }

                if(cur.right!=null){
                    n+=cur.right.val;
                    qu.offer(cur.right);
                }

            }
            if(qu.size()==0) break;
            ans.add(n/(double)qu.size());    
        }
        return ans;
    }
}