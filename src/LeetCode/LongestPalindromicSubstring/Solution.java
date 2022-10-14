package LeetCode.LongestPalindromicSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String longestPalindrome(String s) {

        StringBuilder builder = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for (int left = s.length()/2, right = s.length()/2+1; right < s.length(); left--,right++) {
            Character currentCharR = s.charAt(right);
            Character currentCharL = s.charAt(left);
            if (map.containsKey(currentCharR) || map.containsKey(currentCharL)){
                return builder.toString();
            }

            if (s.length()%2 == 1){
                builder.append(currentCharR);
            } else {
                builder.append(currentCharR);
                builder.insert(0, currentCharL);
            }
            map.put(currentCharR, right);
        }
        return builder.toString();
    }
}