class Solution {
    static int id;
    public String decodeString(String s) {
        id=0;
        return combine(s,0,0);

    }
    public String combine(String s,int idx,int n){
        StringBuilder sb=new StringBuilder();
        int N=0;
        for(int i=idx;i<s.length();i++){
            char a=s.charAt(i);

            if(a=='['){
                sb.append(combine(s,i+1,N));
                N=0;
                i=id;
            }else if(a==']'){
                id=i;
                String temp=sb.toString();
                for(int k=1;k<n;k++)
                    sb.append(temp);

                return sb.toString();
            }
            else if(a>='0'&&a<='9'){
                N=N*10+(a-'0');
            }
            else   sb.append(a);
        }
        return sb.toString();

    }
}