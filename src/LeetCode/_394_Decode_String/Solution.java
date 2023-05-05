package LeetCode._394_Decode_String;

import java.util.Stack;


//Given an encoded string, return its decoded string.
//
//The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
//
//You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
//
//The test cases are generated so that the length of the output will never exceed 105.
//
//Example 1:
//
//Input: s = "3[a]2[bc]"
//Output: "aaabcbc"
//Example 2:
//
//Input: s = "3[a2[c]]"
//Output: "accaccacc"
//Example 3:
//
//Input: s = "2[abc]3[cd]ef"
//Output: "abcabccdcdcdef"
public class Solution {
    public String decodeString(String s) {
        // there can be a number at first
        Stack<Integer> stack_counts = new Stack<>();
        Stack<String> stack_words = new Stack<>();
        int i = 0;
        String res = "";
        while (i < s.length()){
            char cur = s.charAt(i);
            if (Character.isDigit(cur)){
                StringBuilder digit = new StringBuilder();
                while (Character.isDigit(s.charAt(i))){
                    digit.append(s.charAt(i++));
                }
                stack_counts.push(Integer.parseInt(digit.toString()));
            } else if (cur == '['){
                stack_words.push(res);
                res = "";
                i++;
            } else if (cur == ']') {
                StringBuilder builder = new StringBuilder(stack_words.pop());
                int times = stack_counts.pop();
                for (int j = 0; j < times; j++) {
                    builder.append(res);
                }
                res = builder.toString();
                i++;
            } else {
                res += cur;
                i++;
            }
        }
        return res;
    }
}
