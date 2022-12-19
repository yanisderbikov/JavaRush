package LeetCode._167_Two_Sum_II__Input_Array_Is_Sorted;

class Solution {
    // two pointers
    public int[] twoSum1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == target){
                return new int[]{left + 1, right + 1};
            }
            if (sum > target){
                right--;
            } else {
                left++;
            }
        }
        return null;
    }
//    binary search slower than two pointers
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left <= right){
                int midpoint = left + (right - left)/2;
                int sum = nums[midpoint] + nums[i];
                if (sum == target){
                    return new int[]{i+1, midpoint+1};
                }
                if (sum > target) {
                    right = midpoint-1;
                }else {
                    left = midpoint+1;
                }
            }
        }
        return null;
    }
}