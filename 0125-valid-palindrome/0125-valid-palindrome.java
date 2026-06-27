class Solution {
    public boolean isPalindrome(String s) {
      
        List<Character> list=new ArrayList<>();
        int diff='a'-'A';
        for(int i=0;i<s.length();i++){
            char L=s.charAt(i);
            if(L>='0'&&L<='9'){
                list.add(L);
                continue;
            }

            if(L<'A'||L>'z'||(L>'Z'&&L<'a'))continue;
            if(L>='a')L-=diff;
            list.add(L);
        }

        int left=0;
        int right=list.size()-1;
        while(left<right){

            if(list.get(left)==list.get(right)){
                left++;
                right--;
            }
            else return false;
            
        }

        return true;
    }
}