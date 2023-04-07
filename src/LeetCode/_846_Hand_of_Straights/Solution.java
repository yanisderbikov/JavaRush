package LeetCode._846_Hand_of_Straights;

import java.util.TreeMap;

public class Solution {
    public boolean isNStraightHand(int[] nums, int groupSize) {
        if (nums == null) return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int val : nums){
            if (map.containsKey(val)){
                map.replace(val, map.get(val) + 1);
            }else {
                map.put(val, 1);
            }
        }
        while (map.size() > 0){
            int first_card = map.firstKey();
            for (int i = first_card; i < first_card + groupSize; i++) {
                if (!map.containsKey(i)) return false;
                if (map.get(i) == 1){
                    map.remove(i);
                }else {
                    map.replace(i, map.get(i) - 1);
                }
            }
        }
        return true;
    }
}
