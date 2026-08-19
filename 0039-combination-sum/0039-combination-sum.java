class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans=new ArrayList<>();
       choose(candidates,target,new ArrayList<>(),0);
       return ans;
        
    }
    public void choose(int[] arr,int target,List<Integer> list,int idx){
        if(target==0){
            ans.add(new ArrayList<>(list));
        }else{
            for(int i=idx;i<arr.length;i++){
                if(target<arr[i])continue;

                list.add(arr[i]);
                choose(arr,target-arr[i],list,i);
                list.remove(list.size()-1);
            }
        }
    }
}