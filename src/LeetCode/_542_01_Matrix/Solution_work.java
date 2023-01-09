package LeetCode._542_01_Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_work {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> qToCheck = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0){
                    qToCheck.offer(new int[] {i, j});
                }else {
                    mat[i][j] = -1;
                }
            }
        }

        int[][] directions = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int depth = 0;
        while (!qToCheck.isEmpty()){

            depth++;
            int size = qToCheck.size();

            for (int i = 0; i < size; i++) {
                int[] cell = qToCheck.poll();
                for (int[] dir : directions) {

                    int x = cell[0] + dir[0];
                    int y = cell[1] + dir[1];

                    if (    x >= 0 && x < mat.length &&
                            y >= 0 && y < mat[0].length &&
                            mat[x][y] == -1) {
                        mat[x][y] = depth;
                        qToCheck.offer(new int[]{x, y});
                    }
                }
            }
        }
        return mat;
    }
}
