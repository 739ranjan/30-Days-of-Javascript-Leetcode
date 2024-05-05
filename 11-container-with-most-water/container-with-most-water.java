class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;

        while(left<right){
            int  h = Math.min(height[left], height[right]);
            int b = right - left;
            maxArea = Math.max(h*b, maxArea);
            if(height[left] > height[right])
                right--;
            else
                left++;
        }
        return maxArea;
    }
}