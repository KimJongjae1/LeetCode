class Trie {
    Trie[] arr;
    boolean end;
    public Trie() {
        this.arr=new Trie[26];
    }
    
    public void insert(String word) {
        Trie cur=this;
        for(int i=0;i<word.length();i++){
            char a=word.charAt(i);
            int n=a-'a';
            if(cur.arr[n]==null)cur.arr[n]=new Trie();
            cur=cur.arr[n];
        }
        cur.end=true;
    }
    
    public boolean search(String word) {
        Trie cur=this;
        for(int i=0;i<word.length();i++){
            char a=word.charAt(i);
            int n=a-'a';
            if(cur.arr[n]==null)return false;
            cur=cur.arr[n];
        }
        if(cur.end)return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
        Trie cur=this;
        for(int i=0;i<prefix.length();i++){
            char a=prefix.charAt(i);
            int n=a-'a';
            if(cur.arr[n]==null)return false;
            cur=cur.arr[n];
        }
        if(cur.end)return true;
        for(int i=0;i<26;i++){
            if(cur.arr[i]!=null)return true;
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */