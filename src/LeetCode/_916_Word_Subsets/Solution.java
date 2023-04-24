package LeetCode._916_Word_Subsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();

        int[] letters = new int[26];

        for (var word : words2){
            int [] temp = getFreq(word);
            for (int i = 0; i < letters.length; i++) {
                letters[i] = Math.max(letters[i], temp[i]);
            }
        }


        for (var word : words1){
            int[] temp = getFreq(word);

            boolean isValid = true;
            for (int i = 0; i < temp.length; i++) {
                if (letters[i] > temp[i]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) list.add(word);
        }

        return list;
    }
    private int[] getFreq(String s){
        int[] arr = new int[26];
        for (var c : s.toCharArray()){
            arr[c - 'a']++;
        }
        return arr;
    }
}
