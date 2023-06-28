package LeetCode._238_Product_of_Array_Except_Self;

public class Solution {
    // using extra space
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] out = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        for (int i = 0; i < n; i++) {
            out[i] = left[i] * right[i];
        }
        return out;
    }

    // without extra space
    public int[] productExceptSelf_2(int[] nums) {
        int n = nums.length;

        int[] out = new int[n];
        out[0] = 1;


        for (int i = 1; i < n; i++) {
            out[i] = nums[i - 1] * out[i - 1];
        }

        int R = 1;

        for (int i = n - 1; i >= 0; i--) {
            out[i] *= R;
            R *= nums[i];
        }
        return out;
    }
}
