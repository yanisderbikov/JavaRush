package Algorithms.yandexcontests.weekoffer_spring_2023.b;

import java.util.Scanner;

/**
 * Решение верное
 */

public class B {
    public static int reverse(int a, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += a % 10;
            a /= 10;
            res *= 10;
        }
        return res / 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        int b = m - 1;
        int deg = 0;

        if (b == 0) {
            deg = 1;
        }

        while (b != 0) {
            b /= 10;
            deg++;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (reverse(i, deg) < m) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}

