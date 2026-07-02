class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int N=nums.length;

        String t="";
        int bf=0;

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