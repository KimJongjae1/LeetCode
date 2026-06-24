class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        set.add(n);
        int N=n;
        while(true){
            

            int NEW=0;
            while(N>0){
                NEW+=(N%10)*(N%10);
                N/=10;
            }
            N=NEW;
            if(set.contains(N))break;
            set.add(N);
        }
        if(set.contains(1))return true;
        else return false;
    }
}