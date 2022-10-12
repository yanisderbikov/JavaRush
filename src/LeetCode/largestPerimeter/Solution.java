package LeetCode.largestPerimeter;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        while (length >= 3) {
            if (nums[length - 1] < nums[length - 2] + nums[length - 3]) {
                return nums[length - 1] + nums[length - 2] + nums[length - 3];
            }
            length--;
        }
        return 0;
    }
}
