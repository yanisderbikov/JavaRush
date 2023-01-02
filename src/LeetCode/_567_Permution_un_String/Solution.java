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
                    && ch_arr[s2.charAt(left++)]++ >= 0){
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
            map.put(current_char, map.getOrDefault(current_char, 0) + 1);
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
        // boolean ans=false;
    public boolean checkInclusion4(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> tempMap = new HashMap<>();
        for(int i = 0;i < s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int left = 0, right = 0;
        int count_chars = s1.length();
        while(right < s2.length()){
            char rightChar = s2.charAt(right);
            right++;

            if(!map.containsKey(rightChar)){
                left = right;
                tempMap.clear();
            } else{
                tempMap.put(rightChar, tempMap.getOrDefault(rightChar,0) + 1);
                while(right - left > count_chars && left < right){
                    tempMap.put(s2.charAt(left), tempMap.getOrDefault(s2.charAt(left),0) - 1);
                    if (tempMap.get(s2.charAt(left)) == 0) {
                        tempMap.remove(s2.charAt(left));
                    }
                    left++;
                }
                if(right - left == count_chars){
                    if(map.equals(tempMap)){
                        return true;
                    }
                }
            }
        }
        if(map.equals(tempMap)) return true;
        return false;

        // fun(s1,0,s2);
        // return ans;
    }
}

