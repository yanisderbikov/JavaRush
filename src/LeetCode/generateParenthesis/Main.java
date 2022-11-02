package LeetCode.generateParenthesis;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 2;

        var s = solution.generateParenthesis(n);
        pr(s);
    }



    static void pr(List<String> list){
        for (var c : list){
            System.out.println(c);
        }
    }
}
