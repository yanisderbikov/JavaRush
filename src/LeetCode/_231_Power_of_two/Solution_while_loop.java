package LeetCode._231_Power_of_two;

public class Solution_while_loop {
    public boolean isPowerOfTwo(int n) {

        long prod = 1;
        while (n >= prod){
            if (n == prod) return true;
            prod *= 2;
        }
        return false;
    }
}
