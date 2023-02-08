package Algorithms.sorting.QuickSort;

import java.util.Random;

public class MySolution {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n sorted array: ");

        quickSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void quickSort(int[] nums){
        quickSort(nums, 0, nums.length - 1);
    }

    private static void swap(int[] nums, int ind1, int ind2){
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }

    private static void quickSort(int[] nums, int begin, int end){
        if (begin >= end) return;

        int pivotIndex = new Random().nextInt(end - begin) + begin;
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, end);

        int left = begin;
        int right = end - 1;

        while (left < right){
            while (left < right && nums[left] <= pivot){
                left++;
            }
            while (left < right && nums[right] >= pivot){
                right--;
            }
            swap(nums, left, right);
        }

        if (nums[left] > nums[end]){
            swap(nums, left, end);
        }else {
            left = end;
        }

        quickSort(nums, begin, left - 1);
        quickSort(nums, left + 1, end);

    }
}
