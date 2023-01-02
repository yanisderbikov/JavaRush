package Algorithms;

import Algorithms.sorting.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{10,12,11,1,3,2,6,5};
        solution.shaker(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
