package LeetCode._3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashMap;
import java.util.Map;

class Solution {

    //    Window Sliding Algorithm

    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> visitedCharacters = new HashMap<>();
        int maxLenght = 0;
        for (int right = 0, left = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            if (visitedCharacters.containsKey(currentChar)
                    && visitedCharacters.get(currentChar) >= left) {
                left = visitedCharacters.get(currentChar) + 1;
            }
            visitedCharacters.put(currentChar, right);
            maxLenght = Math.max(maxLenght, right - left + 1 );

        }
        return maxLenght;
    }
    // I prefere better that variant
    public int lengthOfLongestSubstring2(String s) {
        if (s == null) return 0;
        if (s.length() == 1) return 1;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = -1, right = 0;
        while (right < s.length()){
            char currentChar = s.charAt(right);
//            int index = map.getOrDefault(currentChar, i);
            if (map.containsKey(currentChar) && map.get(currentChar) > left){
                int indexFound = map.get(currentChar);
                left = indexFound;
            }
            map.put(currentChar, right);
            max = Math.max(right - left, max);
            right++;
        }
        return max;
    }
}
