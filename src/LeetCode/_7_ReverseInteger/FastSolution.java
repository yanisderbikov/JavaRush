package LeetCode._7_ReverseInteger;


//  1534236469

public class FastSolution {
    public int reverse(int x) {
        long result = 0;
        int maxValue = Integer.MAX_VALUE;
        if (x == 0){
            return 0;
        }

        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
            if (result > maxValue || result < -maxValue){
                return 0;
            }
        }
        return (int) result;
    }
}

