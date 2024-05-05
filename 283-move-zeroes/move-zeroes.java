class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1)
            return ;

        int nonZeroIndex = 0, countZero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                countZero++;
            }else{
                nums[nonZeroIndex++] = nums[i];
            }
        }

        for(int i=nums.length - 1; countZero>0; countZero--){
            nums[i] = 0;
            i--;
        }
    }
}