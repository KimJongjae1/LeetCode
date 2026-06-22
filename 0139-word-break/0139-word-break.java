class Solution {
    class trie{
        trie[] t;
        boolean end;

        trie(){
            t=new trie[26];
            end=false;
        }

        void insert(String s){
            trie cur=this;
            for(int i=0;i<s.length();i++){
                char a=s.charAt(i);
                int idx=a-'a';
                if(cur.t[idx]==null)cur.t[idx]=new trie();
                cur=cur.t[idx];
            }
            cur.end=true;
        }

        boolean exist(String s,int idx,Boolean[] visit){
            if(idx==s.length())return true;

            if(visit[idx]!=null)return visit[idx];

            trie cur=this;
            for(int i=idx;i<s.length();i++){
                char a=s.charAt(i);
                int id=a-'a';
                
                if(cur.t[id]==null) break;
                if(cur.t[id].end){
                    if(exist(s,i+1,visit)) 
                        return visit[idx]=true;
                }

                cur=cur.t[id];
            }
            return visit[idx]=false;
        }
    }
    
    public boolean wordBreak(String s, List<String> wordDict) {
        trie root=new trie();
        
        for(String str:wordDict){
            root.insert(str);
        }
        Boolean[] visit=new Boolean[s.length()];
        return root.exist(s,0,visit);
    }
}