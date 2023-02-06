package LeetCode._574_Numbers_of_provinces;

public class Solution {
    public int findCircleNum(int[][] nums) {
        boolean[] visited = new boolean[nums.length]; //visited[i] means if ith person is visited in this algorithm
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!visited[i]) {
                fill(nums, visited, i);
                count++;
            }
        }
        return count;
    }
    private void fill(int[][] nums, boolean[] visited, int i) {
        for(int j = 0; j < nums.length; j++) {
            if(nums[i][j] == 1 && !visited[j]) {
                //We found an unvisited i in the current friend cycle
                visited[j] = true;
                fill(nums, visited, j); //Start DFS on this new found i
            }
        }
    }
}