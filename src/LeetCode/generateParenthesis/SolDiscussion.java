package LeetCode.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

//The idea here is to only add '(' and ')' that we know will guarantee us a solution
// (instead of adding 1 too many close). Once we add a '(' we will then discard it and try a ')'
// which can only close a valid '('. Each of these steps are recursively called.


public class SolDiscussion {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n); // типа тут передана ссылка -> будет менять с дальше
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max) {

        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max)
            backtrack(list, str + "(", open + 1, close, max);
        if (close < open)
            backtrack(list, str + ")", open, close + 1, max);
    }
}
