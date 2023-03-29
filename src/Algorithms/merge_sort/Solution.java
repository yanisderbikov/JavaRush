package Algorithms.merge_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        int[] array = new int[10000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }
        printArray("BEFORE", array);
        mergeSort(array);
        printArray("AFTER", array);
    }
    private static void mergeSort(int[] inputArray){
        int lengthInputArray = inputArray.length;
        if (lengthInputArray < 2) return;

        int mid = lengthInputArray / 2;
        int[] left = Arrays.copyOfRange(inputArray, 0, mid);
        int[] right = Arrays.copyOfRange(inputArray, mid, lengthInputArray);

        mergeSort(left);
        mergeSort(right);

        merge(inputArray, left, right);
    }
    private static void merge(int[] inputArray, int[] left, int[] right){
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                inputArray[k++] = left[i++];
            }else {
                inputArray[k++] = right[j++];
            }
        }

        while (i < left.length){
            inputArray[k++] = left[i++];
        }
        while (j < right.length){
            inputArray[k++] = right[j++];
        }

    }
    private static void printArray(String str, int[]nums){
        System.out.println(str);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
