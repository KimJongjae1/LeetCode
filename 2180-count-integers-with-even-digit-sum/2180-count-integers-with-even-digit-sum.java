class Solution {
    static int ans;
    public int countEven(int num) {
       ans=0;
       for(int i=1;i<=9;i++){
         sum(i,num,i);
       }
       return ans;
    }
    public static void sum(int n,int num,int sum){
        if(n>num)return;
        if(sum%2==0)ans++;

        for(int i=0;i<=9;i++){
            sum(n*10+i,num,sum+i);
        }
    }
}