package LeetCode._13_Roman_to_Integer;

class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int number = 0;
        int resent = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            switch (ch){
                case 'I' : number = 1; break;
                case 'V' : number = 5; break;
                case 'X' : number = 10; break;
                case 'L' : number = 50; break;
                case 'C' : number = 100; break;
                case 'D' : number = 500; break;
                case 'M' : number = 1000; break;
            }
            if (resent <= number){
                ans += number;
                resent = number;
            }else {
                ans -= number;
                resent = number;
            }
        }
        return ans;
    }
}

