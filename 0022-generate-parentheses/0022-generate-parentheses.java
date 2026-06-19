class Solution {
    static List<String> ans;
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        close(0,0,n,"");
        return ans;
    }
    public static void close(int comb,int left,int n,String s){
        if(comb+left>n)return;
        if(comb==n){
            ans.add(new String(s));
            return;
        }
    
        close(comb,left+1,n,s+"(");

        if(left>0)
            close(comb+1,left-1,n,s+")");
        
      
    }
}