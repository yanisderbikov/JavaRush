package LeetCode._118_Pascal_triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(){{add(1);}});
        for (int i = 1; i < numRows; i++) {
            Integer[] arr = new Integer[i+1];
            arr[0] = 1;
            arr[arr.length - 1] = 1;
//            List<Integer> list = createList(i+1);
            List<Integer> list = Arrays.asList(arr); // why it is't worjing!!
            list.add(0, 1);
            list.add(i, 1);
            result.add(list);
        }
        build(result, 0);
        return result;
    }
    private void build(List<List<Integer>> result, int layer){
        if (layer <= 0 || layer - 1 >= result.size()) return;

        int left = 0, right = 1;
        int size = result.get(layer).size();
        while (right < size){

            int sum = result.get(layer).get(left) + result.get(layer).get(right);
            result.get(layer+1).add(left+1, sum);
            left++;
            right++;
        }
        build(result, layer+1);
    }
    private List<Integer> createList(int size){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(0);
        }
        return list;
    }
}