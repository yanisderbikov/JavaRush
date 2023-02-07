package LeetCode._797_All_path_from_source_to_target;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(graph, result, path, 0);
        return result;
    }
    void dfs(int[][] graph, List<List<Integer>> result, List<Integer> path, int u){
        path.add(u);
        if (u == graph.length - 1){
            result.add(new ArrayList<>(path));
        }else {
            for (int v : graph[u]){
                dfs(graph, result, path, v);
            }
        }
        path.remove(path.size() - 1);
    }
}
