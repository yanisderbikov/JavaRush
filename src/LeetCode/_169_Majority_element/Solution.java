package LeetCode._169_Majority_element;

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int counter = 0;
        int result = 0;
        int last = -1;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != last){
                if (counter > result){
                    result = counter;
                    ans = last;
                }
                last = nums[i];
                counter = 0;
            }
            counter++;
        }
        return counter > result ? nums[nums.length-1] : ans ;
    }
}