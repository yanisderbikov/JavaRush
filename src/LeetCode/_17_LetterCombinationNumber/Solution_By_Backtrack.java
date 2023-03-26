package LeetCode._17_LetterCombinationNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_By_Backtrack {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty() || digits == null) return new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> result = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), result, map);
        return result;
    }
    private void backtrack(String digits, int level, StringBuilder builder,
                           List<String> result, Map<Character, String> map ){

        if (builder.length() == digits.length()){
            result.add(builder.toString());
        }else {
            String cur = map.get(digits.charAt(level));
            for (int j = 0; j < cur.length(); j++) {
                builder.append(cur.charAt(j));
                backtrack(digits, level + 1, builder, result, map);
                builder.delete(builder.length() - 1, builder.length());
            }
        }
    }
}
