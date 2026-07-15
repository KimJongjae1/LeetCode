class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int start=nums[0];
        for(int i=1;i<nums.length;i++){

            if(nums[i-1]+1!=nums[i]){
                
                if(start==nums[i-1]){
                    list.add(Integer.toString(start));
                }else{
                    sb.append(start);
                    sb.append("->");
                    sb.append(nums[i-1]);
                    list.add(sb.toString());

                    sb.setLength(0);                       
                }
                start=nums[i];
   
            }

        }
        if(start==nums[nums.length-1]){
           list.add(Integer.toString(start));     
        }else{
            sb.append(start);
            sb.append("->");
            sb.append(nums[nums.length-1]);
            list.add(sb.toString());
        }
        return list;
    }
}