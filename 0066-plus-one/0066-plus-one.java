class Solution {
    public int[] plusOne(int[] digits) {
        String str="";
        for(int i=0;i<digits.length;i++){
            str+=digits[i];
        }
        char[] temp=str.toCharArray();
        int idx=temp.length-1;
        while(idx>=0){
            int n=temp[idx]-'0';
            if(n==9){
                temp[idx]='0';
            }else{
                temp[idx]=(char)(temp[idx]+1);    
                break;
            }
            idx--;
        }
        int[] ans;
        if(idx<0){
            ans=new int[temp.length+1];
            Arrays.fill(ans,0);
            ans[0]=1;
            return ans;
        }else{
            ans=new int[temp.length];
        }

        for(int i=0;i<temp.length;i++){
            ans[i]=temp[i]-'0';
        }

        return ans;
    }
}