class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return nums.length;
        int left=0, right=1;
        while(right < nums.length){
            if(nums[right] != nums[left]){
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return ++left;
    }
}