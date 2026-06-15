class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int idx=0;

        for(int i=0;i<nums.length;i++){
            int id=lowerbound(nums[i],list);

            if(idx==id){
                idx++;
                list.add(nums[i]);
            }else{
                list.set(id,nums[i]);
            }
        }
        return list.size();
    }
    public static int lowerbound(int t,List<Integer> list){
        int max=list.size();
        int min=0;
        while(min<max){
            int mid=(max+min)/2;

            if(list.get(mid)>=t){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;
    }
}