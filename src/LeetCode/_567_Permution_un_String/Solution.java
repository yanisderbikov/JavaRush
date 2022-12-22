package LeetCode._567_Permution_un_String;

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
}

