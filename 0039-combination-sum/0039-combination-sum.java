class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        choose(target,candidates,0,list,0);
        return ans;
    }
    public static void choose(int target,int[] arr,int sum,List<Integer> list,int idx){
        if(sum>target)return;
        else if(sum==target){
            ans.add(new ArrayList(list));
            return;
        }

        if(idx>=arr.length)return;
        choose(target,arr,sum,list,idx+1);
        int S=sum;
        while(target>S){
            list.add(arr[idx]);
            S+=arr[idx];
            choose(target,arr,S,list,idx+1);
        }

        while(S!=sum){
            list.remove(list.size()-1);
            S-=arr[idx];
        }

    }
}