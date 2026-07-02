class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;

          long max=x;
          long min=0;
          while(min<max){
            long mid=(max+min)/2;

            if(mid*mid>=x){
                max=mid;
            }else{
                min=mid+1;
            }

          }
          if(min*min==x)return (int)min;
          return (int)min-1;
    }
}