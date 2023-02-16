package LeetCode._169_Majority_element;

import java.util.Arrays;

public class SolByDevide {
    // it means there should be one helf greater than other
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        if (nums[n / 2] == nums[n / 4]) return nums[n / 4];
        return nums[ 3 * n / 4];
    }
}
