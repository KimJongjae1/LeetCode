class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int before=10000;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char A=s.charAt(i);
            int cur=map.get(A);

            if(before<cur){
              ans-=2*before;   
            }

            before=cur;
            ans+=cur;

        }
        return ans;
    }
}