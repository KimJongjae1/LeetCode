class Solution {
    static List<String> ans;
    class trie{
        trie[] arr;
        boolean end;
        String S;
        
        trie(){
            arr=new trie[26];
            end=false;
            S=null;
        }

        void insert(String s){
            trie cur=this;
            for(int i=0;i<s.length();i++){
                int n=s.charAt(i)-'a';

                if(cur.arr[n]==null)cur.arr[n]=new trie();
                cur=cur.arr[n];
            }
            cur.end=true;
            cur.S=s;
        } 

    }
    static boolean[][] visit;
    static int[] diy={-1,1,0,0};
    static int[] dix={0,0,-1,1};
    static int N;
    static int M;
    static char[][] b;
    public List<String> findWords(char[][] board, String[] words) {
        ans=new ArrayList<>();
        b=board;
        trie t=new trie();
        for(String s:words){
            t.insert(s);
        }
        N=board.length;
        M=board[0].length;
        visit=new boolean[N][M];
        for(int i=0;i<N;i++){
            for(int k=0;k<M;k++){
                int n=board[i][k]-'a';
                if(t.arr[n]!=null){
                    visit[i][k]=true;
   
                    BACK(i,k,t.arr[n]);
                
                    visit[i][k]=false;
                }
                
            }
        }
        return ans;
    }
    public void BACK(int y,int x,trie t){

        if(t.end){
            if(t.S!=null){
                ans.add(t.S);
                t.S=null;
            }
        }
        

        for(int i=0;i<4;i++){
            int Y=y+diy[i];
            int X=x+dix[i];
            if(Y<0||Y>=N||X<0||X>=M)continue;
            if(visit[Y][X])continue;
            int n=b[Y][X]-'a';
            if(t.arr[n]==null)continue;
            visit[Y][X]=true;
       
            BACK(Y,X,t.arr[n]);
            
            visit[Y][X]=false;
        }

    }
}