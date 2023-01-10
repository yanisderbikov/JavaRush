package LeetCode._994_Rooting_Oranges;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int orangesRotting(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 2){
                    queue.offer(new int[]{i, j});
                }else if (mat[i][j] == 1){
                    mat[i][j] = -1;
                }
            }
        }

        int counter = -1;
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()){

            counter++;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();

                for (int[] dir : directions) {

                    int x = cell[0] + dir[0];
                    int y = cell[1] + dir[1];

                    if (x < mat.length && x >= 0 &&
                            y < mat[0].length && y >= 0 &&
                            mat[x][y] == -1) {
                        queue.offer(new int[]{x, y});
                        mat[x][y] = 2;
                    }
                }
            }
        }

        if (counter == -1) counter = 0; // if were no iteration;

//        _______cheking_if_there_-1_we_are_fucked_up_____
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == -1){
                    return -1;
                }
            }
        }

        return counter;
    }
}
