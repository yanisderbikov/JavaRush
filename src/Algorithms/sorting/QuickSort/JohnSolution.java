package Algorithms.sorting.QuickSort;
import java.util.Random;

public class JohnSolution {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[1000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before:");
        printArray(numbers);

        quicksort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] nums, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, highIndex);

        int left = lowIndex;
        int right = highIndex - 1;

        while (left < right) {

            // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
            while (nums[left] <= pivot && left < right) {
                left++;
            }

            // Walk from the right until we find a number less than the pivot, or hit the left pointer.
            while (nums[right] >= pivot && left < right) {
                right--;
            }

            swap(nums, left, right);
        }

        // This is different from what the video has, and fixes an issue where the last value could potentially be out of order.
        // Thanks to viewer Wilson Barbosa for suggesting the fix!
        if(nums[left] > nums[highIndex]) {
            swap(nums, left, highIndex);
        } else {
            left = highIndex;
        }

        quicksort(nums, lowIndex, left - 1);
        quicksort(nums, left + 1, highIndex);

    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
