class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        TreeMap<Integer,Set<Integer>> map=new TreeMap<>();
        Map<Integer,Integer> cnt=new HashMap<>();
        for(int n:nums){
            if(!cnt.containsKey(n)){
                cnt.put(n,1);
                map.putIfAbsent(1,new HashSet<>());
                map.get(1).add(n);
            }else{
                int idx=cnt.get(n);
                cnt.put(n,idx+1); 

                map.get(idx).remove(n);
                map.putIfAbsent(idx+1,new HashSet<>());
                map.get(idx+1).add(n);

            }
        }

        int key=Integer.MAX_VALUE;
        int[] ans=new int[k];
        int idx=0;
        while(idx<k){
            key=map.lowerKey(key);
            
            for(int n:map.get(key)){

                ans[idx++]=n;
                if(idx==k)break;
            }
        }
        return ans;
    }
}