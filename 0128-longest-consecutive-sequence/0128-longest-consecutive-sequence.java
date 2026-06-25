class Solution {
    static Set<Integer> set;
    static int ans;
    public int longestConsecutive(int[] nums) {
        set=new HashSet<>();

        for(int i:nums) 
            set.add(i);
            
        int ret=0;
        for(int i:nums){
            ans=0;
            DFS(i);
            ret=Math.max(ans,ret);
        }
        return ret;

    }
    public static void DFS(int n){
        if(set.contains(n)){
            set.remove(n);
            ans++;
            DFS(n-1);
            DFS(n+1);
        }
    }
}