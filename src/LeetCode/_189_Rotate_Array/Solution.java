package LeetCode._189_Rotate_Array;

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // this is needed if k > nums.lenght()
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int left, int right){
        while (left < right){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}