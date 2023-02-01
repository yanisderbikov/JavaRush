package LeetCode._713_Subarray_Product_Less_Than_k;

public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null) return 0;
        if (k <= 1) return 0;
        int left = 0, right = 0;
        int result = 0;
        int prod = 1;

        while (right < nums.length){
            prod *= nums[right];
            while (prod >= k){
                prod /= nums[left];
                left++;
            }
            result += right - left + 1; // this is the key of solution
            right++;
        }
        return result;
    }
}
