package LeetCode._414_Third_Maximum_Number;

import java.util.Arrays;

public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        return find3(nums);
    }
    private int find3(int[] nums){
        int max = nums[nums.length - 1];
        int count = 2;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (nums[i] < max){
                max = nums[i];
                count--;
            }
            if (count == 0) return max;
        }
        return nums[nums.length - 1];
    }
}
