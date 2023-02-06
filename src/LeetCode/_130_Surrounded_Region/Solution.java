package LeetCode._130_Surrounded_Region;

public class Solution {
    public void solve(char[][] nums) {
        if (nums == null) return;
        int lenOfHor = nums.length, lenOfVer = nums[0].length;
        boolean[][] visited = new boolean[lenOfHor][lenOfVer];
//        cheacking borders and mark them as visited
//        horizontal borders
        for (int i = 0; i < lenOfHor; i++) {
            fill(nums, i, 0, visited);
            fill(nums, i, lenOfVer - 1, visited);
        }
//        vertical
        for (int j = 0; j < lenOfVer; j++) {
            fill(nums, 0, j, visited);
            fill(nums, lenOfHor-1, j, visited);
        }

//        converting all the possible
        for (int i = 0; i < lenOfHor; i++) {
            for (int j = 0; j < lenOfVer; j++) {
                if (nums[i][j] == 'O' && !visited[i][j])
                    convert(nums, i, j, visited);
            }
        }
    }

    void convert(char[][] nums, int i, int j, boolean[][] visited){
        if (i < 0 || j < 0 || i >= nums.length || j >= nums[0].length
                || nums[i][j] == 'X' || visited[i][j]) return;

        visited[i][j] = true;
        nums[i][j] = 'X';

        convert(nums, i+1, j, visited);
        convert(nums, i-1, j, visited);
        convert(nums, i, j+1, visited);
        convert(nums, i, j-1, visited);
    }

    void fill(char[][]nums, int i, int j, boolean[][] visited){
        if (i < 0 || j < 0 || i >= nums.length || j >= nums[0].length
                || nums[i][j] == 'X' || visited[i][j]) return;

        visited[i][j] = true;

        fill(nums, i+1, j, visited);
        fill(nums, i-1, j, visited);
        fill(nums, i, j+1, visited);
        fill(nums, i, j-1, visited);
    }

}
