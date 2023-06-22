package LeetCode._290_Word_Pattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] array = s.split(" ");

        if (array.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(array[i])) return false;
            }else {
                if (map.containsValue(array[i])) return false;
                map.put(c, array[i]);
            }
        }
        return true;
    }
}
