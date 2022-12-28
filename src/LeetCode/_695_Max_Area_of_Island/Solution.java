package LeetCode._695_Max_Area_of_Island;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    int count = 0;
    int ans = 0;
    public int maxAreaOfIsland(int[][] grid) {
//        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1){
                    count = 0;
                    fill(grid, i, j);
                    ans = Math.max(count, ans);
                }
            }
        }
        return ans;
    }
    void fill(int[][] grid, int row, int coloms){
        if ( row < 0 || coloms < 0 || row >= grid.length || coloms >= grid[0].length ||
                grid[row][coloms] == 0) {
            return;
        }
        grid[row][coloms] = 0;
        count++;
        fill(grid, row+1, coloms);
        fill(grid, row-1, coloms);
        fill(grid, row, coloms-1);
        fill(grid, row, coloms+1);
    }
}
