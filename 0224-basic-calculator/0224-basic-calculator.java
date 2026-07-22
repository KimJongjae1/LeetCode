class Solution {
    public int calculate(String s) {

        Stack<Integer> num=new Stack<>();
        int N=0;
        int ans=0;
        int sign=1;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            int n=a-'0';

            if(n>=0&&n<=9){
                N=N*10+n;
            }else if(a=='('){
                num.push(ans);
                num.push(sign);

                sign=1;
                ans=0;
            }else if(a==')'){
                ans+=N*sign;
                N=0;
                ans*=num.pop();
                ans+=num.pop();

                
            }else if(a=='-'){
                ans+=N*sign;
                N=0;
                sign=-1;
            }else if(a=='+'){
                ans+=N*sign;
                N=0;   
                sign=1;
            }


        }
        if(N!=0)ans+=N*sign;
        return ans;

        
    }
}