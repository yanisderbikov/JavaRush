package LeetCode._7_ReverseInteger;

public class FastSolution {
    public int reverse(int x) {
        int result = 0;
        if (x == 0){
            return 0;
        }

        while (x != 0) {
            if (x > Math.pow(2, 31) || x < Math.pow(-2, 31)){
                return 0;
            }
            result += x % 10;
            x /= 10;
        }
        return result;
    }
}
