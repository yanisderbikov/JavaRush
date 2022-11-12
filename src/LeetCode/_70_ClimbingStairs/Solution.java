package LeetCode._70_ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        int[] K = new int[n+1];
        K[0] = 0;
        K[1] = 1;
        for (int i = 2; i <= n ; ++i) {
            K[i] = K[i - 1] + K[i - 2];
        }
        return K[n];
    }
}
