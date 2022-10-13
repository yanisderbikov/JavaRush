package LeetCode.SearchInsertPosition;

import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int searchInsert(int[] nums, int target) {

        ArrayList<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        if (list.contains(target)){
            return list.indexOf(target);
        } else {

            int o = list.stream().filter(x -> x < target)
                    .max(Comparator.naturalOrder())
                    .get();

            return list.indexOf(o);

        }
    }
}