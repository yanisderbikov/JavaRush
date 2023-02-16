package LeetCode._169_Majority_element;

import java.util.Arrays;

public class EasiestDevide {
    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
    }
}
