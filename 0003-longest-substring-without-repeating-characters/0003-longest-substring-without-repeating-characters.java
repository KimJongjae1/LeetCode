class Solution {
    static Set<Character> set;
    static int ans;
    public int lengthOfLongestSubstring(String s) {
        set=new HashSet<>();
        ans=0;
        find(0,0,s);
        return ans;
    }
    public static void find(int left,int right,String s){

        int cnt=0;
        while(right<s.length()){
            char temp=s.charAt(right);
            
            while(set.contains(temp)){
                set.remove(s.charAt(left++));
                cnt--;
            }
           
            set.add(temp);
            cnt++;
            right++;
            
            ans=Math.max(ans,cnt);

        }
    }  
}