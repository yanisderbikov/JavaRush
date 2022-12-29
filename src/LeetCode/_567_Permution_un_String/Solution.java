package LeetCode._567_Permution_un_String;

import java.util.HashMap;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map = new int[26];
        for(char curChar : s1.toCharArray())
            map[curChar - 'a']++;

        int right = 0, left = 0;
        int count_chars = s1.length();

        while(right < s2.length()){
            if(map[s2.charAt(right++) - 'a']-- > 0)
                count_chars--;
            if(count_chars == 0)
                return true;
            if(right - left == s1.length()
                    && map[s2.charAt(left++) - 'a']++ >= 0)
                count_chars++;
        }
        return false;
    }
    public boolean checkInclusion2(String s1, String s2) {
        int[] ch_arr = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            ch_arr[s1.charAt(i) ]++;
        }

        int left = 0;
        int right = 0;
        int count_chars = s1.length();

        while (right < s2.length()){
            if (ch_arr[s2.charAt(right++) ]-- > 0){
                count_chars--;
            }
            if (count_chars == 0){
                return true;
            }
            if (right - left == s1.length()
                    && ch_arr[s2.charAt(left++) ]++ >= 0){
                count_chars++;
            }
        }
        return false;
    }
    public boolean checkInclusion3(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            char current_char = s1.charAt(i);
            if (map.containsKey(current_char)){
                map.put(current_char, map.get(current_char) + 1);
            }else {
                map.put(current_char, 1);
            }
            count++;
        }

        int left = 0, right = 0;

        while (right < s2.length()){

            char rightChar = s2.charAt(right);
            char leftChar = s2.charAt(left);

            if (map.containsKey(rightChar)){
                map.put(rightChar, map.get(rightChar) - 1);
            }
            right++;

            int res = count;
            for (int n : map.values()){
                if (n == 0){
                    res++;
                }else {
                    break;
                }
            }
            if (res == 0) return true;

            if (right - left == s1.length()) {
                if (map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                left++;
            }
        }
        return false;

    }
}

