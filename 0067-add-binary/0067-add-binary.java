class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();

        int aidx=a.length()-1;
        int bidx=b.length()-1;
        int N=0;
        while(aidx>=0&&bidx>=0){
            int A=a.charAt(aidx)-'0';
            int B=b.charAt(bidx)-'0';

            int temp=A+B+N;
            if(temp%2==0)sb.append('0');
            else sb.append('1');

            if(temp>=2)N=1;
            else N=0;

            aidx--;
            bidx--;
        }
        String s;
        int idx=0;
        if(aidx>=0){
            s=a;
            idx=aidx;
        }else{
            s=b;
            idx=bidx;
        }


            while(idx>=0){
                int S=s.charAt(idx)-'0';
                if(S+N==1){
                    sb.append('1');
                    N=0;
                }else if(S+N==2){
                    sb.append('0');
                    N=1;
                }else {
                    sb.append('0');
                    N=0;
                }

                idx--;
            }
            if(N==1)sb.append('1');
            return sb.reverse().toString();
        
    }
    
}