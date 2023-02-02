package LeetCode._209_Minimum_Size_Subarray_Sum;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0;
        int result = Integer.MAX_VALUE;
        while (right < nums.length){
            sum += nums[right];
            while (sum >= target){
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
            right++;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
