class Solution {
    public void reverse(int arr[], int s, int l){
        for(int i=s, j=l; i<=j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    } 
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k==0) return;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
}