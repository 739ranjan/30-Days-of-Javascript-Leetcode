class Solution {
    public int longestSubarray(int[] nums) {
        int prev1count = 0, new1count = 0, max = Integer.MIN_VALUE;
        boolean zero = false;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                max = Math.max(new1count, max);
                new1count = prev1count;
                prev1count = 0;
                zero = true;
            }else{
                prev1count++;
                new1count++;
            }
        }
        if(!zero)
            return nums.length - 1;
        max = Math.max(new1count, max);
        return max;
    }
}