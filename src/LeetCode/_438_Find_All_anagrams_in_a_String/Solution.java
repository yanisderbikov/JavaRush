package LeetCode._438_Find_All_anagrams_in_a_String;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[128];
        int left = 0;
        int right = 0;

        int count_chars = p.length();

        for (int i = 0; i < p.length(); i++) {
            arr[p.charAt(i)]++;
        }

        while (right < s.length()){
            if (arr[s.charAt(right++)]-- > 0 && count_chars > 0){
                count_chars--;
            }
            if (right - left == p.length() && count_chars == 0){
                list.add(left);
            }
            if (right - left == p.length() && arr[s.charAt(left++)]++ >= 0){
                count_chars++;
            }
        }
        return list;
    }
}
