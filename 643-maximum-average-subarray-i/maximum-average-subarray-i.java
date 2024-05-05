class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        
        double currSum = sum;
        for(int i=k, j=0; i<nums.length; i++, j++){
            currSum = currSum - nums[j] + nums[i];
            sum = Math.max(sum, currSum);
        }
        
        return sum/k;
    }
}