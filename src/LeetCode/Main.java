package LeetCode;


import LeetCode._118_Pascal_triangle.*;


import java.util.*;

//LeetCode._567_Permution_un_String
//import LeetCode._733_Flood_Fill.Solution;
public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        char[] chars = "([{}]{})".toCharArray();

        boolean isTrue = check(chars);
        System.out.println(isTrue);

    }
    private static boolean check(char[] chars){
        Stack<Character> stack = new Stack<>();
        Set<Character> close = new HashSet<>();
        Set<Character> open = new HashSet<>();

        close.add('}'); open.add('{');
        close.add(']'); open.add('[');
        close.add(')'); open.add('(');
        for (int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            if (close.contains(cur) && !stack.isEmpty()){
                if (stack.pop()-1 != cur) return false;
            }else {
                stack.push(cur);
            }
        }
        return stack.isEmpty();
    }
}
