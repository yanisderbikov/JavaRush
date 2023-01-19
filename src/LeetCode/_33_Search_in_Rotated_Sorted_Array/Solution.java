package LeetCode._33_Search_in_Rotated_Sorted_Array;

public class Solution {
    // задача заключается в том, чтобы найти  в каком месте массив перевернут.
    // далее мы ищем в какой из сторон находится 'target'
    // ищем в ограниченной области target

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] > nums[right]){
                left = midpoint+1;
            }else {
                right = midpoint;
            }
        }

        left = 0;
        right = nums.length - 1;
        int pivot = left;
        if (target > nums[pivot]){
            left = pivot;
        }else {
            right = pivot;
        }

        while (left <= right){
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target){
                return midpoint;
            } else if (target < nums[midpoint]) {
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }
        return -1;
    }
}
