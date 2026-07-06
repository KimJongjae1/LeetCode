class Solution {
    static HashSet<String> visit;
    static int end;
    static HashSet<String> set;
    static class pair{
        String str;
        int cnt;

        pair(String str,int cnt){
            this.str=str;
            this.cnt=cnt;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        set=new HashSet<>(wordList);
        visit=new HashSet<>();
        
        return BFS(beginWord,endWord);
    }
    public static int BFS(String beginWord,String endWord){
        Queue<pair> qu=new LinkedList<>();
        visit.add(beginWord);
        qu.offer(new pair(beginWord,1));
        while(!qu.isEmpty()){
            pair cur=qu.poll();
            String s=cur.str;
            int c=cur.cnt;

            if(s.equals(endWord)){
                return c;
            }

            for(int k=0;k<26;k++){
                char a=(char)('a'+k);
                char[] A=s.toCharArray();
                for(int i=0;i<s.length();i++){
                    if(A[i]==a)continue;
                    char temp=A[i];
                    A[i]=a;
                    String NEW=new String(A);

                    if(set.contains(NEW)&&!visit.contains(NEW)){
                        visit.add(NEW);
                        qu.offer(new pair(NEW,c+1));
                    }
                    A[i]=temp;
                }      
            }
            

        }
        return 0;
    }

}