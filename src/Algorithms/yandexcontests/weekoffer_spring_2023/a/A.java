package Algorithms.yandexcontests.weekoffer_spring_2023.a;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Решение верное
 */

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение вводных данных
        int N = scanner.nextInt();
        int[] difficulties = new int[N];

        for (int i = 0; i < N; i++) {
            difficulties[i] = scanner.nextInt();
        }

        // Вывод результата
        int result = planSprint(N, difficulties);
        System.out.println(result);
    }

    public static int planSprint(int N, int[] difficulties) {
        int left = 0, right = N - 1;  // указатели на крайние сложности
        int[] pairs = new int[N / 2];  // массив для хранения суммарных сложностей пар

        int index = 0;
        while (left < right) {
            int pairSum = difficulties[left] + difficulties[right];
            pairs[index] = pairSum;

            left++;
            right--;
            index++;
        }

        // Проверяем, что все пары имеют одинаковую суммарную сложность
        if (Arrays.stream(pairs).allMatch(p -> p == pairs[0])) {
            return pairs[0];
        } else {
            return -1;
        }
    }
}

