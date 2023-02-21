package LeetCode._599_Minimum_Index_Sum_of_Two_Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] findRestaurant(String[] l1, String[] l2) {

        Map<String, Integer> map1 = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < l1.length; i++) {
            map1.put(l1[i], i);
        }
        int counter = Integer.MAX_VALUE;
        for (int i = 0; i < l2.length; i++) {
            if (map1.containsKey(l2[i])){
                if (counter > map1.get(l2[i]) + i){
                    list = new ArrayList<>();
                    counter = map1.get(l2[i]) + i;
                }
                if (counter == map1.get(l2[i]) + i){
                    list.add(l2[i]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}
