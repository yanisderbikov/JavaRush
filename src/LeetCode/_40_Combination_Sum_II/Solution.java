package LeetCode._40_Combination_Sum_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] nums, int rem, int start, List<Integer> list, List<List<Integer>> result){
        if (rem < 0) return;
        if (rem == 0) {
            result.add(new ArrayList<>(list));
        }else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) continue;
                list.add(nums[i]);
                backtrack(nums, rem - nums[i], i + 1, list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}
