package LeetCode._917_Reverse_Only_Letters;

import java.util.Stack;

public class Solution_second {
    public String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                stack.push(s.charAt(i));
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                builder.append(stack.pop());
            }else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }

}
