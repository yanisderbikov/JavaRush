package LeetCode.generateParenthesis;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        SolutionBySol sol = new SolutionBySol();
        SolDiscussion solD = new SolDiscussion();
        int n = 3;

//        var s = solution.generateParenthesis(n);
//        var s = sol.generateParenthesis(n);
        var s = solD.generateParenthesis(n);
        pr(s);
    }



    static void pr(List<String> list){
        for (var c : list){
            System.out.println(c);
        }
    }
}
