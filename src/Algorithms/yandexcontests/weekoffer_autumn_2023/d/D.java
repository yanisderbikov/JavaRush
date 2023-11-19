package Algorithms.yandexcontests.weekoffer_autumn_2023.d;

import java.util.Scanner;

/**
 * Задача решена неверно
 */

public class D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение входных данных с консоли
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Вызов функции и вывод результата
        int result = countPalindromicTimes(n, m);
        System.out.println(result);
    }

    public static int countPalindromicTimes(int n, int m) {
        final int MOD = 1_000_000_007;

        int maxLen = Math.max(n - 1, m - 1);
        int count = 0;

        for (int hour = 0; hour < n; hour++) {
            for (int minute = 0; minute < m; minute++) {
                String hourStr = String.format("%0" + maxLen + "d", hour);
                String minuteStr = String.format("%0" + maxLen + "d", minute);

                String timeStr = hourStr + ":" + minuteStr;

                if (isPalindrome(timeStr)) {
                    count++;
                }
            }
        }

        return count % MOD;
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
