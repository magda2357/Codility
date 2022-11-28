package org.example;

import java.util.Arrays;

import static java.lang.Math.max;

public class MaxCounters {
    public static int[] countMax(int n, int[] arr) {

        int[] result = new int[n];
        int max = 0;
        int max_fin = 0;
        for (int j : arr) {

            if (j <= n) {
                if (result[j - 1] <= max_fin) {
                    result[j - 1] = max_fin;
                }
                result[j - 1] += 1;
                if (result[j - 1] > max) {
                    max = result[j - 1];
                }
            } else {
                max_fin = max;
            }
        }

        for (int i = 0; i < n; i++) {
            result[i] = max(max_fin, result[i]);
        }
        return result;
    }

    public static int[] countMax2(int n, int[] arr) {
        int[] result = new int[n];
        int max = 0;

        for (int j : arr) {

            if (j <= n) {
                if (result[j - 1] > max) {
                    max = result[j - 1];
                }
                result[j - 1] += 1;
                max = max(result[j - 1], max);
            } else {
                Arrays.fill(result, max);
            }
        }
        return result;
    }

    public static int[] produceRandomeArray(int range, int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range + 1);
        }
        return array;
    }

    public static void main(String[] args) {

        //Random big data test-only for effectivness test
        int[] array = produceRandomeArray(90000, 100000);
        int len = 10000;
        long startTime = System.nanoTime();
        countMax(len, array);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        startTime = System.nanoTime();
        countMax2(len, array);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        System.out.println("Big data done");
        System.out.println();

        //Regular tests - MaxCount 100%, MaxCount2 77% effective
        System.out.println(Arrays.toString(countMax(10, new int[]{3, 6, 4, 12, 13, 4, 4, 3, 3, 11, 3, 3, 6, 1})));
        System.out.println(Arrays.toString(countMax2(10, new int[]{3, 6, 4, 12, 13, 4, 4, 3, 3, 11, 3, 3, 6, 1})));
        System.out.println();
        System.out.println(Arrays.toString(countMax(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
        System.out.println(Arrays.toString(countMax2(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
        System.out.println();
        System.out.println(Arrays.toString(countMax(2, new int[]{1, 3})));
        System.out.println(Arrays.toString(countMax2(2, new int[]{1, 3})));
        System.out.println();
        System.out.println(Arrays.toString(countMax(1, new int[]{1})));
        System.out.println(Arrays.toString(countMax2(1, new int[]{1})));
        System.out.println();
        System.out.println(Arrays.toString(countMax(1, new int[]{2, 1})));
        System.out.println(Arrays.toString(countMax2(1, new int[]{2, 1})));
        System.out.println();
        System.out.println(Arrays.toString(countMax(1, new int[]{1, 2})));
        System.out.println(Arrays.toString(countMax2(1, new int[]{1, 2})));
    }

}
