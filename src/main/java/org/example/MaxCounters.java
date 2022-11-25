package org.example;

import java.util.Arrays;

import static java.lang.Math.max;

public class MaxCounters {
    public static int[] countMax(int n, int[] arr) {

        int[] result = new int[n];
        int max = 0;

        for (int j : arr) {

            if (j <= n) {
                result[j - 1] += 1;
                max = max(result[j - 1], max);
            } else {
                Arrays.fill(result, max);
            }

        }
        return result;
    }

    public static int[] countMax2(int n, int[] arr) {

        int[] result = new int[n];
        int max = 0;
        for (int j : arr) {

            if (j <= n) {
                result[j - 1] += 1;
                max = max(result[j - 1], max);
            } else {
                Arrays.fill(result, max);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(countMax(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        long startTime2 = System.nanoTime();
        System.out.println(Arrays.toString(countMax2(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
        long endTime2 = System.nanoTime();
        System.out.println(endTime2 - startTime2);


        System.out.println(Arrays.toString(countMax(2, new int[]{1, 3})));
        System.out.println(Arrays.toString(countMax(1, new int[]{1})));
        System.out.println(Arrays.toString(countMax(1, new int[]{2, 1})));
        System.out.println(Arrays.toString(countMax(1, new int[]{1, 2})));
    }

}
