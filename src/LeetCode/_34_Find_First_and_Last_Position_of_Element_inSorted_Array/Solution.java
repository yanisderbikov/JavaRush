package LeetCode._34_Find_First_and_Last_Position_of_Element_inSorted_Array;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), second(nums, target)};
    }
    private int first(int[] nums, int target){
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int midpoint = (left + right) / 2;
            if (target == nums[midpoint]) index = midpoint;
            if (target <= nums[midpoint]){ // there is a difference
                right = midpoint - 1;
            }else {
                left = midpoint + 1;
            }
        }
        return index;
    }
    private int second(int[] nums, int target){
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int midpoint = (left + right) / 2;
            if (target == nums[midpoint]) index = midpoint;
            if (target >= nums[midpoint]){ // there is a difference
                left = midpoint + 1;
            }else {
                right = midpoint - 1;
            }
        }
        return index;
    }

}
