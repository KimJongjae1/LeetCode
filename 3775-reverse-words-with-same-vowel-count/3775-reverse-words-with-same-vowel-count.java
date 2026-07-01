import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st=new StringTokenizer(s);

        String ans=st.nextToken();
        int N=Count(ans);
        StringBuilder sb=new StringBuilder(ans);
        
        while(st.hasMoreTokens()){
            sb.append(" ");
            String cur=st.nextToken();

            if(N==Count(cur)){
                sb.append(reverse(cur));
            }
            else sb.append(cur);
        }
        return sb.toString();
    }
    public int Count(String a){
        int n=0;
        for(int i=0;i<a.length();i++){
            char A=a.charAt(i);
            if(A=='a'||A=='e'||A=='i'||A=='o'||A=='u')
                n++;
        }
        return n;
    }
    public String reverse(String a){
        StringBuilder sb=new StringBuilder(a);
        return sb.reverse().toString();
    }
}