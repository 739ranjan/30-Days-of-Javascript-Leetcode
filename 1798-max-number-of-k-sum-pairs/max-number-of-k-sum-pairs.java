class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[0] >= k)
            return 0;
        
        int left = 0, right = nums.length-1;
        int count = 0;

        while(nums[right] >= k)
            right--;
        
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum == k){
                count++;
                left++;
                right--;
            }else if(sum > k){
                right--;
            }else{
                left++;
            }
        }
        return count;
    }
}