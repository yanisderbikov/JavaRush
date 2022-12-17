package LeetCode._35_insertBinaryS;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length;
        int left = 0;
        int midpoint = 0;

        while (left < right){
            midpoint = left + (left + right)/2;
            if (nums[midpoint] == target) return midpoint;
            if (nums[midpoint] < target) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return right;

    }
}
