package LeetCode._74_Search_a_2D_Matrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (searchInRow(matrix[i], target)) return true;
        }
        return false;
    }

    boolean searchInRow(int[] nums, int target){
        if (target < nums[0]) return false;
        if (target > nums[nums.length - 1]) return false;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target) return true;
            if (target > nums[midpoint]){
                left = midpoint + 1;
            }else {
                right = midpoint - 1;
            }
        }
        return false;
    }
}
