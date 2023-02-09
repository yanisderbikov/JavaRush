package LeetCode._231_Power_of_two;

public class Recursion {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n == 0) return false;

        if (n % 2 != 0) {
            return false;
        } else {
            return isPowerOfTwo(n / 2);
        }
    }

}
