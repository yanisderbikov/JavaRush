package LeetCode._20_parthness;

import java.util.Stack;

public class SolutionC {
    public boolean isValid(String s) {
        if (s == null) return false;
        final String open = "({[", close = ")}]";
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) // пробегаемся по всей строчке с помощью массива
            if (open.indexOf(c) != -1 ) stack.push(c);
            else if ( stack.isEmpty() || open.indexOf(stack.pop()) != close.indexOf(c) ) return false;
        return stack.isEmpty();
    }
}