package LeetCode._424_Longest_Repeating_Character_Replacement;



//You are given a string s and an integer k. You can choose any character of the string and change it
// to any other uppercase English character. You can perform this operation at most k times.
//
//Return the length of the longest substring containing the same letter you can get after performing the above operations.
//
//Example 1:
//
//Input: s = "ABAB", k = 2
//Output: 4
//Explanation: Replace the two 'A's with two 'B's or vice versa.
//Example 2:
//
//Input: s = "AABABBA", k = 1
//Output: 4
//Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//The substring "BBBB" has the longest repeating letters, which is 4.
//There may exists other ways to achive this answer too.
//Constraints:
//
//1 <= s.length <= 105
//s consists of only uppercase English letters.
//0 <= k <= s.length

public class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        int max_lenght = 0;
        int max_chars = 0;
        int[] count_chars = new int[128];
        while (right < s.length()){
            count_chars[s.charAt(right)]++;
            int cur_chars = count_chars[s.charAt(right)];
            max_chars = Math.max(max_chars, cur_chars);

            while (right - left + 1 - max_chars > k){
                count_chars[s.charAt(left)]--;
                left++;
            }
            max_lenght = Math.max(max_lenght, right - left + 1);
            right++;
        }
        return max_lenght;
    }
}
