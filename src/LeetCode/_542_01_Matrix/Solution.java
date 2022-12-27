package LeetCode._542_01_Matrix;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                }
                else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll(); // возвращяет шапку
            for (int[] d : dirs) {
                int r = cell[0] + d[0];
                int c = cell[1] + d[1];
                if (r < 0 || r >= m || c < 0 || c >= n ||
                        matrix[r][c] <= matrix[cell[0]][cell[1]] + 1) continue;
                queue.add(new int[] {r, c});
                matrix[r][c] = matrix[cell[0]][cell[1]] + 1;
            }
        }
        return matrix;
    }


    //--------------------------------


    public class Pair{
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[][] directions = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public int[][] updateMatrix2(int[][] matrix) {
        //  Step 1:Store all the 0's index in queue and make all 1 as -1 in the matrix
/*
for eg:
       0 0 0
       0 1 1
       1 1 1

       make this as
       0 0 0
       0 -1 -1
       -1 -1 -1

*/

        ArrayDeque<Pair> q=new ArrayDeque<>();
        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y <matrix[x].length; y++){
                if(matrix[x][y] == 0){
                    // stored it in queue
                    q.add(new Pair(x,y)); // coordinates x, y,
                }
                else{
                    // make it as -1
                    matrix[x][y] =- 1; // not zeros makes -1
                }
            }
        }

        // Now Start removing elements from queue check whehther its neighbour are less than 0 i.e -1;

        while(q.size()!=0){
            Pair rem = q.removeFirst();

            // after removing check if its neighbour are -1 or not

            for(int i = 0; i < directions.length; i++){
        /*
        we already have a dirs matrix={ { 1, 0 },
                                       { -1, 0 },
                                       { 0, 1 },
                                       { 0, -1 } }
        */
                int nRow = rem.x + directions[i][0];//we are selecting it as a pair row and coloumn combine
                int nColomn = rem.y + directions[i][1];


                // Now we are checking element less than 0 around 0 in 4 direction
                if(nRow >= 0 && nColomn >= 0 && nRow < matrix.length && nColomn < matrix[0].length && matrix[nRow][nColomn] < 0){

                    matrix[nRow][nColomn] = matrix[rem.x][rem.y] + 1;//distance of 1 unit will be added

                    q.addLast(new Pair(nRow,nColomn));
                    //   Now where -1 was present initially we are going to add its index into as now its distance will alod be added into the queue so that where -1 is still present its distance will also be added

                }
            }
        }

        return matrix;
    }
}

