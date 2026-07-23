class Solution {
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];

        dp[0]=1;
        if(s.charAt(0)=='0')return 0;
        if(s.length()==1) return 1;


        for(int i=1;i<s.length();i++){
            char a=s.charAt(i);
            

            int n=a-'0';

            if(n!=0){
                dp[i]=dp[i-1];
            }
  
            int temp=Integer.parseInt(s.substring(i-1,i+1));

            if(temp>=10&&temp<=26){
                if(i>1)dp[i]+=dp[i-2];
                else dp[i]+=1;
            }
            
        }
        return dp[s.length()-1];
    }
}