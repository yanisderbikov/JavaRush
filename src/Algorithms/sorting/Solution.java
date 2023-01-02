package Algorithms.sorting;

public class Solution {
    public void bumbleSort(int[] nums){
        if (nums.length == 1 || nums == null) return;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public void twoPointers(int[] nums){
        if (nums.length == 1) return;
        int left = 0;
        int right = nums.length - 1;

        while (right >= left){
            if (nums[right] < nums[left]){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            left++;
            right--;
        }
    }

    public void shaker(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while (right >= left){
            for (int i = left; i < right; i++) {
                if (nums[i] > nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            for (int i = right; i > left; i--) {
                if (nums[i] > nums[i-1]){
                    int temp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = temp;
                }
            }
            left++;
            right--;
        }
    }


}
