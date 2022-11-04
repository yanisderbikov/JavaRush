package LeetCode._7_ReverseInteger;

public class FastSolution {
    public int reverse(int x) {
        int result = 0;
        if (x == 0){
            return 0;
        }

        while (x != 0) {
            result = result*10 + x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                return 0;
            }
        }
        return result;
        
    }
}

