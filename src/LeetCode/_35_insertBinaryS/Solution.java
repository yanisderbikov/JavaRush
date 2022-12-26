package LeetCode._35_insertBinaryS;

class Solution {
    public int searchInsert(int[] nums, int target) {
//        if (nums.length == 1) return 0;
        int left = 0;
        int right = nums.length - 1;
        if (target > nums[right]) return right + 1;
        if (target < nums[0]) return 0;
        while (left <= right){
            int midpoint = left + (right - left) / 2;
            if (target == nums[midpoint]) return midpoint;
            if (target < nums[midpoint]){
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }
        return left;
    }
}
