package LeetCode._442_Find_All_Dublicates_in_an_Array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // main condition is 1 <= nums[i] <= n

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) list.add(index + 1);
            nums[index] = -nums[index];
        }
        return list;
    }
}