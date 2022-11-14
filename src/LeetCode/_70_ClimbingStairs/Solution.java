package LeetCode._70_ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2)return n;
        int[] K = new int[n];
        K[0] = 1;
        K[1] = 2;
        for(int i = 2; i < n; i++){
            K[i] = K[i-1] + K[i-2];
        }
        return K[n-1];
    }
}
