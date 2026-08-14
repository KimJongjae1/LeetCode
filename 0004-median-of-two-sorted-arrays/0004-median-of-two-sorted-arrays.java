class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N=nums1.length;
        int M=nums2.length;
        int[] merge=new int[N+M];
        int idx1=0;
        int idx2=0;

        while(idx1+idx2<N+M){
            if(idx1==N){
                merge[idx1+idx2]=nums2[idx2++];
            }else if(idx2==M){
                merge[idx1+idx2]=nums1[idx1++];
            }else{
                merge[idx1+idx2]=nums1[idx1]>nums2[idx2] ? nums2[idx2++]:nums1[idx1++];
            }
        }

        return (merge[(N+M)/2]+merge[(N+M-1)/2])/2.0;
    }
}