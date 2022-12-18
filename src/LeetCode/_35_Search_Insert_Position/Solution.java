package LeetCode._35_Search_Insert_Position;

class Solution {
    public int searchInsert(int[] nums, int target) {

        if(nums == null || nums.length == 0) return 0;

        int right = nums.length-1;
        int left = 0;
        int midpoint = 0;

        if (nums[0] > target) return 0;
        if (nums[nums.length-1] < target) return nums.length;

        while (left <= right){
            midpoint = left + (right - left)/2;
            if (nums[midpoint] == target){
                return midpoint;
            }else if (nums[left] > target
                    && nums[right] < target
                    && (right == left + 1)) {
                return right;
            }else if (nums[midpoint] < target) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return right+1;

    }
}
