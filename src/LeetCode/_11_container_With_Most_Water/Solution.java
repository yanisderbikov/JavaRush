package LeetCode._11_container_With_Most_Water;

public class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result = 0;

        while (left < right){
            result = Math.max(result, (right - left) * Math.min(nums[left], nums[right]));
            if (nums[left] < nums[right]){
                left++;
            }else {
                right--;
            }
        }
        return result;
    }
}
