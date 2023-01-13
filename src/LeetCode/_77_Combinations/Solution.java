package LeetCode._77_Combinations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine1(int n, int k) {
        List<List<Integer>> ans = new LinkedList();
        if (n < k || k == 0) {
            return ans;
        }

        // Case I: Add number n to answer
        ans = combine(n-1, k-1);
        if (ans.isEmpty()) {
            ans.add(new LinkedList<Integer>()); // base case, initialize empty list
        }
        for (List<Integer> list:ans) {
            list.add(n);              // add n to final ans
        }

        // Case II: Do not add number n to answer
        ans.addAll(combine(n-1, k));

        return ans;
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        combine(combs, new ArrayList<Integer>(), 1, n, k);
        return combs;
    }
    public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if(k==0) {
            combs.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<=n;i++) {
            comb.add(i);
            combine(combs, comb, i+1, n, k-1);
            comb.remove(comb.size()-1);
        }
    }

    public List<List<Integer>> combine3(int n, int k) {
        List<List<Integer>> list = new LinkedList<>();
        backtrack(list,n,k,1,new ArrayList<Integer>());
        return list;
    }
    private void backtrack(List<List<Integer>> list, int n, int k, int start, List<Integer> tempList){
        if(k==0) {
            list.add(new LinkedList<>(tempList));   // условие выхода
            return;                                 // добавляется
        }
        for(int i = start;i<=n-k+1;i++){
            tempList.add(i);
            backtrack(list,n,k-1,i+1,tempList);
            tempList.remove(tempList.size()-1);
        }
    }


}
