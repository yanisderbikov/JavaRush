package LeetCode._20_parthness;

import java.util.HashMap;
import java.util.Map;

public class SolutionMap {
    public boolean isValid(String s) {
        int round = 0;
        int figured = 0;
        int squared = 0;
        char roundOpen      = '(';
        char figuredOpen    = '{';
        char squaredOpen    = '[';
        char roundClose     = ')';
        char figuredClose   = '}';
        char squaredClose   = ']';

        Map<Character, Integer> map = new HashMap<>(); // K -> Char  V -> +- val
        map.put(roundOpen, 0);
        map.put(figuredOpen, 0);
        map.put(squaredOpen, 0);
        map.put(roundClose, 0);
        map.put(figuredClose, 0);
        map.put(squaredClose, 0);

        if (s == null) return false;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int val = map.get(currentChar) + 1;
            map.replace(currentChar, val);
        }
        if (    map.get(figuredClose)!= map.get(figuredOpen) ||
                map.get(squaredClose)!= map.get(squaredOpen) ||
                map.get(roundClose)!=   map.get(roundOpen)
        ) {
            return false;
        }
        return true;
    }
}
