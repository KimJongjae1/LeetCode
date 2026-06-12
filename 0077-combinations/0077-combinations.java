class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans=new ArrayList<>();
        DFS(0,k,new ArrayList<>(),1,n);
        return ans;

    }
    public static void DFS(int level,int k,List<Integer> list,int left,int right){
        if(level==k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=left;i<=right;i++){

            list.add(i);
            DFS(level+1,k,list,i+1,right);
            list.remove(list.size()-1);
        }
    }
}