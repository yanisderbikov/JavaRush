package LeetCode.largestPerimeter;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        if (!(nums[length - 1] > nums[length - 2] - nums[length - 3])){
            return 0;
        } else {
            int sum = nums[length - 1] + nums[length - 2] + nums[length - 3];
            return sum;
        }
    }
}
