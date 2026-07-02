class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int N=nums.length;
        if(N==0)return list;

        String t="";
        int bf=0;
        if(N==1) {
            t+=nums[0];
            list.add(t);
            return list;
        }
        for(int i=1;i<=N;i++){
            if(i==N||nums[i-1]+1!=nums[i]){
                t+=nums[bf];
                if(bf!=i-1){
                    t+="->";
                    t+=nums[i-1];
                }
                list.add(t);
                t="";
                bf=i;
            }
           
        }
        return list;

    }
}