class Solution {
    static List<String> ans;
    static List<Character>[] list;
    public List<String> letterCombinations(String digits) {
        ans=new ArrayList<>();
        list=new ArrayList[10];
        char a='a';
        for(int i=2;i<=9;i++){
            list[i]=new ArrayList<>();
            if(i<=6||i==8){
                for(int k=0;k<3;k++){
                    list[i].add(a);
                    a+=1;
                }
            }else{
               for(int k=0;k<4;k++){
                    list[i].add(a);
                    a+=1;
                }     
            }
        }
        
        DFS(0,digits,new StringBuilder());
        return ans;

    }
    public static void DFS(int idx,String str,StringBuilder sb){
        if(idx==str.length()){
            ans.add(sb.toString());
            return;
        }
        int id=str.charAt(idx)-'0';
        for(char a:list[id]){
            sb.append(a);
            DFS(idx+1,str,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}