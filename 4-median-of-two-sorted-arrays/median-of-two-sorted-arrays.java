class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] num = new int[n+m];
        int i = 0, j = 0, k = 0;
        while(i != n && j != m){
            if(nums1[i] <= nums2[j]){
                num[k++] = nums1[i++];
            }else{
                num[k++] = nums2[j++];
            }
        }

        while(i != n){
            num[k++] = nums1[i++];
        }

        while(j != m){
            num[k++] = nums2[j++];
        }

        double res = 0;
        int mid = (n + m) / 2;
        if((n + m) % 2 == 0){
           res =  (num[mid] + num[mid-1]) / 2.0;
        }else{
            res = num[mid];
        }

        return res;
    }
}