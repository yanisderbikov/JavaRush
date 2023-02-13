package LeetCode._46_permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutate(nums, new ArrayList<>(), result);
        return result;

    }
    private static void permutate(int[] nums, List<Integer> list, List<List<Integer>> result){
        if (list.size() == nums.length){
            result.add(new ArrayList<>(list));
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) continue;
                list.add(nums[i]);
                permutate(nums, list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}