class Solution {
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];

        dp[0]=1;
        if(s.charAt(0)=='0')return 0;
        if(s.length()==1) return 1;

        int temp=Integer.parseInt(s.substring(0,2));
        if(temp>20&&s.charAt(1)=='0')return 0;
        if(temp<=26&&s.charAt(1)!='0')dp[1]=2;
        else dp[1]=1;

        
        for(int i=2;i<s.length();i++){
            char a=s.charAt(i);
            

            int n=a-'0';

            int before=s.charAt(i-1)-'0';
            if(n==0){
                if(before==0||before>=3)return 0;
                dp[i]=dp[i-2];
                continue;
                
            }

            dp[i]=dp[i-1];
            if(before==0) continue;
            
            if(n<=6){
                if(before<=2){
                    dp[i]+=dp[i-2];
                }
            }else{
                
                if(before<=1){
                    dp[i]+=dp[i-2];
                }
            }
        }
        return dp[s.length()-1];
    }
}