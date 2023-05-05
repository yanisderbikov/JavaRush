package LeetCode._819_Most_Common_Word;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


// Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.
//
//The words in paragraph are case-insensitive and the answer should be returned in lowercase.
//
//Example 1:
//
//Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
//Output: "ball"
//Explanation:
//"hit" occurs 3 times, but it is a banned word.
//"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
//Note that words in the paragraph are not case sensitive,
//that punctuation is ignored (even if adjacent to words, such as "ball,"),
//and that "hit" isn't the answer even though it occurs more because it is banned.
//Example 2:
//
//Input: paragraph = "a.", banned = []
//Output: "a"

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> ban = new HashSet<>();
        for (var v : banned){
            ban.add(v);
        }

        paragraph = paragraph.toLowerCase();
        int left = 0;
        for (var word : paragraph.split("\\W+")){ // this is searching for a all punctuation symbols
            if (word.isEmpty() || ban.contains(word)) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String output = "";
        int max = 0;
        for (var pair : map.entrySet()){
            String key = pair.getKey();
            int val = pair.getValue();
            if (val > max){
                output = key;
                max = val;
            }
        }
        return output;
    }
}
