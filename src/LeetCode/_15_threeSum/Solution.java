package LeetCode._15_threeSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    // 15.11.2022 it's really slow solution. Dont try to solve with tha
    public List<List<Integer>> threeSum(int[] nums) {
//        итерируемся по первому элементу
//        в этом форе мы ищем пару, которая будет давть target
        List<List<Integer>> listOfLists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i], indexFirst = i;
            Map<Integer, Integer> map = new HashMap<>(); // K -> index; V -> sum to 0
            for (int j = i+1; j < nums.length; j++) {
                int second = nums[j], indexSecond = j;
                int target = -(first + second); // 0
                if (map.containsValue(target)){
                    for (var pair : map.entrySet()){
                        if (pair.getValue() == target){
                            int indexThird = pair.getKey();
                            List<Integer> list = new ArrayList<>(){{
                                add(indexFirst);
                                add(indexSecond);
                                add(indexThird);
                            }};
                            listOfLists.add(list);
                        }
                    }
                }else {
                    map.put(j, target);
                }
            }
        }
        return listOfLists;
    }
}
