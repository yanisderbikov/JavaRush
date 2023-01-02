package LeetCode._77_Combinations;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new LinkedList();
        if (n < k || k == 0) return ans;

        // Case I: Add number n to answer
        ans = combine(n-1, k-1);
        if (ans.isEmpty()) ans.add(new LinkedList<Integer>()); // base case, initialize empty list
        for (List<Integer> list:ans) list.add(n);              // add n to final ans

        // Case II: Do not add number n to answer
        ans.addAll(combine(n-1, k));

        return ans;
    }
}
