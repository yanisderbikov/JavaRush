package Algorithms.windowSliding;

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
}
