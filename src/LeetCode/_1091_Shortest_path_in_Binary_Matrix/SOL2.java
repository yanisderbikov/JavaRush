package LeetCode._1091_Shortest_path_in_Binary_Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class SOL2 {
    public int shortestPathBinaryMatrix(int[][] nums) {
        int n = nums.length;
        int ans = 0;
        if (nums == null || nums[0][0] == 1 || nums[n-1][n-1] == 1) return -1;

        boolean[][] visited = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();
        int[][] dirs = new int[][]{{-1, 0},{-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}};

        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()){
            int size = queue.size();
            ans++;

            for (int i = 0; i < size; i++) {
                int[] currentPos = queue.poll();

                if (currentPos[0] == n - 1 && currentPos[1] == n - 1) return ans;

                for (int[] dir : dirs) {
                    int x = currentPos[0] + dir[0];
                    int y = currentPos[1] + dir[1];

                    if (x < 0 || y < 0 || x >= n || y >= n || nums[x][y] == 1 || visited[x][y]) continue;

                    queue.offer(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }
        return -1;
    }
}
