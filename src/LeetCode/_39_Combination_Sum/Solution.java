package LeetCode._39_Combination_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] nums, int start, int rem,
                           List<Integer> list, List<List<Integer>> result){
        if (rem < 0) return;
        if (rem == 0){
            result.add(new ArrayList<>(list));
        }else {
            for (int i = start; i < nums.length; i++) {
                list.add(nums[i]);
                backtrack(nums, i, rem - nums[i], list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}
