class Solution {
    static List<List<Integer>> list;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        list=new ArrayList<>();
        DFS(0,candidates,target,new ArrayList<>());
        return list;

    }
    public static void DFS(int idx,int[] arr,int remain,List<Integer> temp){
        if(remain==0){
            list.add(new ArrayList(temp));
            return;
        }
     

        for(int i=idx;i<arr.length;i++){

            if(i>idx&&arr[i]==arr[i-1])continue;

            if(remain<arr[i])continue;

            temp.add(arr[i]);
            DFS(i+1,arr,remain-arr[i],temp);
            temp.remove(temp.size()-1);

        }


    }
    
}