class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int idx1=0;
         int idx2=0;
         int[] num=new int[m];
         for(int i=0;i<m;i++){
            num[i]=nums1[i];
         }
        int idx=0;
         while(idx<m+n){
            
            if(idx1<m&&idx2<n){
                if(num[idx1]<nums2[idx2]){
                    nums1[idx]=num[idx1++];
                }else{
                    nums1[idx]=nums2[idx2++];
                }
            }else if(idx1==m){
               while(idx2<n){
                nums1[idx++]=nums2[idx2++];
               } 
            }else if(idx2==n){
              while(idx1<m){
                nums1[idx++]=num[idx1++];
              }
            }
            idx++;

         }


         
    }
}