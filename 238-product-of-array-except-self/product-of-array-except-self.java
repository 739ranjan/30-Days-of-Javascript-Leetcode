class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];

        int suff = 1;
        for(int i=0; i<n; i++){
            res[i] = suff;
            suff *= nums[i];
        }
        // System.out.println(Arrays.toString(res));
        int pref = 1;
        for(int i=n-1; i>=0; i--){
            res[i] *= pref;
            pref *= nums[i];
        }
        return res;
    }
}