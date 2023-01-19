package LeetCode._153_Find_Minimum_in_Rotated_Sorted_Array;

public class Solution {
    public int findMin(int[] nums) {
        if (nums.length <= 1) return nums[0];

        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] > nums[right]){
                left = midpoint + 1;
            }else {
                right = midpoint;
            }
        }

        int pivot = left;

        return Math.min(nums[pivot], nums[0]);

    }
}
