package LeetCode._402_Remove_K_Digits;

import java.util.Stack;

public class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();
        if (num.length() == k) return "0";

        for (int i = 0; i < num.length(); i++) {
            // main thing about greedy algorithm
            while (k > 0 && !stack.isEmpty() && num.charAt(i) < stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        // if there are skips we are just deleting from the end
        while (k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder builder = new StringBuilder();

        while (!stack.isEmpty()){
            builder.append(stack.pop()); // buider now is reversed
        }

        builder.reverse();

        // deleting zeros
        while (builder.length() > 1 && builder.charAt(0) == '0'){
            builder.deleteCharAt(0);
        }

        return builder.toString();
    }
}
