class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n < 3)
            return false;

        int min=Integer.MAX_VALUE, mid=Integer.MAX_VALUE;

        boolean found = false;
        for(int i=0; i<n; i++){
            if(!found){
                min = Math.min(nums[i], min);
                mid = nums[i]>min ? Math.min(nums[i], mid) : mid;
                found = mid < nums[i];
            }else{
                break;
            }
        }
        return found;
    }
}