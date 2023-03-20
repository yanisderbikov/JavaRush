package LeetCode._763_Partition_Lables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for(int left = 0, right = 0; right < s.length(); right++) {
            max = Math.max(max, map.get(s.charAt(right)));
            if(max == right) {
                list.add(right - left + 1);
                left = right + 1;
            }
        }
        return list;
    }
}