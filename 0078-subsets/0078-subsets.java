class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        back(0,nums,ans,new ArrayList<>());
        return ans;
    }
    public void back(int idx,int[] arr,List<List<Integer>> ans,List<Integer> temp){
        ans.add(new ArrayList<>(temp));

        for(int i=idx;i<arr.length;i++){
            temp.add(arr[i]);
            back(i+1,arr,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}